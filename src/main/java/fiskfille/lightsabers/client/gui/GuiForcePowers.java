package fiskfille.lightsabers.client.gui;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.google.common.collect.Lists;

import fiskfille.lightsabers.Lightsabers;
import fiskfille.lightsabers.common.block.ModBlocks;
import fiskfille.lightsabers.common.data.ALData;
import fiskfille.lightsabers.common.helper.ALHelper;
import fiskfille.lightsabers.common.power.EnumPowerType;
import fiskfille.lightsabers.common.power.Power;
import fiskfille.lightsabers.common.power.PowerData;
import fiskfille.lightsabers.common.power.PowerManager;
import fiskfille.lightsabers.common.power.PowerStats;

public class GuiForcePowers extends GuiScreen
{
    private static final int field_146572_y = AchievementList.minDisplayColumn * 24 - 112;
    private static final int field_146571_z = AchievementList.minDisplayRow * 24 - 112;
    private static final int field_146559_A = AchievementList.maxDisplayColumn * 24 - 77;
    private static final int field_146560_B = AchievementList.maxDisplayRow * 24 - 77;
    private static final ResourceLocation textures = new ResourceLocation("textures/gui/achievement/achievement_background.png");
    private static final ResourceLocation icons = new ResourceLocation(Lightsabers.modid, "textures/gui/icons.png");
    protected GuiScreen prevScreen;
    protected int xSize = 256;
    protected int ySize = 202;
    protected int prevMouseX;
    protected int prevMouseY;
    protected float zoom = 1;
    protected int xpDrained;
    protected double field_146569_s;
    protected double field_146568_t;
    protected double field_146567_u;
    protected double field_146566_v;
    protected double field_146565_w;
    protected double field_146573_x;
    private int field_146554_D;
    private PowerManager powerManager;

    private GuiButton button;
    private LinkedList<Power> powers = new LinkedList<Power>();

    public GuiForcePowers(GuiScreen gui, EntityPlayer player)
    {
        prevScreen = gui;
        powerManager = new PowerManager(player);
        short short1 = 141;
        short short2 = 141;
        field_146569_s = field_146567_u = field_146565_w = (double)(AchievementList.openInventory.displayColumn * 24 - short1 / 2 - 12);
        field_146568_t = field_146566_v = field_146573_x = (double)(AchievementList.openInventory.displayRow * 24 - short2 / 2);
        powers.clear();
        
        for (Object power : Power.powers)
        {
        	powers.add((Power)power);
        }
    }

    public void initGui()
    {
        buttonList.clear();
        buttonList.add(new GuiOptionButton(1, width / 2 + 24, height / 2 + 74, 80, 20, I18n.format("gui.done")));
    }

    protected void actionPerformed(GuiButton button)
    {
        if (button.id == 1)
        {
            mc.displayGuiScreen(prevScreen);
        }
    }

    protected void keyTyped(char c, int key)
    {
        if (key == mc.gameSettings.keyBindInventory.getKeyCode())
        {
            mc.displayGuiScreen((GuiScreen)null);
            mc.setIngameFocus();
        }
        else
        {
            super.keyTyped(c, key);
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        int k;

        if (Mouse.isButtonDown(0))
        {
            k = (width - xSize) / 2;
            int l = (height - ySize) / 2;
            int i1 = k + 8;
            int j1 = l + 17;

            if ((field_146554_D == 0 || field_146554_D == 1) && mouseX >= i1 && mouseX < i1 + 224 && mouseY >= j1 && mouseY < j1 + 155)
            {
                if (field_146554_D == 0)
                {
                    field_146554_D = 1;
                }
                else
                {
                    field_146567_u -= (double)((float)(mouseX - prevMouseX) * zoom);
                    field_146566_v -= (double)((float)(mouseY - prevMouseY) * zoom);
                    field_146565_w = field_146569_s = field_146567_u;
                    field_146573_x = field_146568_t = field_146566_v;
                }

                prevMouseX = mouseX;
                prevMouseY = mouseY;
            }
        }
        else
        {
            field_146554_D = 0;
        }

        k = Mouse.getDWheel();
        float f4 = zoom;

        if (k < 0)
        {
            zoom += 0.25F;
        }
        else if (k > 0)
        {
            zoom -= 0.25F;
        }

        zoom = MathHelper.clamp_float(zoom, 1, 2);

        if (zoom != f4)
        {
            float f6 = f4 - zoom;
            float f5 = f4 * (float)xSize;
            float f1 = f4 * (float)ySize;
            float f2 = zoom * (float)xSize;
            float f3 = zoom * (float)ySize;
            field_146567_u -= (double)((f2 - f5) * 0.5F);
            field_146566_v -= (double)((f3 - f1) * 0.5F);
            field_146565_w = field_146569_s = field_146567_u;
            field_146573_x = field_146568_t = field_146566_v;
        }

        if (field_146565_w < (double)field_146572_y)
        {
            field_146565_w = (double)field_146572_y;
        }

        if (field_146573_x < (double)field_146571_z)
        {
            field_146573_x = (double)field_146571_z;
        }

        if (field_146565_w >= (double)field_146559_A)
        {
            field_146565_w = (double)(field_146559_A - 1);
        }

        if (field_146573_x >= (double)field_146560_B)
        {
            field_146573_x = (double)(field_146560_B - 1);
        }

        drawDefaultBackground();
        drawBackground(mouseX, mouseY, partialTicks);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        drawForeground();
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
    }

    public void updateScreen()
    {
        field_146569_s = field_146567_u;
        field_146568_t = field_146566_v;
        double d0 = field_146565_w - field_146567_u;
        double d1 = field_146573_x - field_146566_v;

        if (d0 * d0 + d1 * d1 < 4.0D)
        {
            field_146567_u += d0;
            field_146566_v += d1;
        }
        else
        {
            field_146567_u += d0 * 0.85D;
            field_146566_v += d1 * 0.85D;
        }
    }

    protected void drawForeground()
    {
        int i = (width - xSize) / 2;
        int j = (height - ySize) / 2;
        fontRendererObj.drawString(I18n.format("gui.forcePowers"), i + 15, j + 5, 4210752);

        boolean flag1 = false;
        int color = flag1 ? 16777215 : 8453920;
        String s = "Xp: " + ALHelper.getTotalXp(mc.thePlayer);
        int x = i + 15;
        int y = j + ySize - 25;
        fontRendererObj.drawString(s, x + 1, y, 0);
        fontRendererObj.drawString(s, x - 1, y, 0);
        fontRendererObj.drawString(s, x, y + 1, 0);
        fontRendererObj.drawString(s, x, y - 1, 0);
        fontRendererObj.drawString(s, x, y, color);
    }

    protected void drawBackground(int mouseX, int mouseY, float partialTicks)
    {
        int k = MathHelper.floor_double(field_146569_s + (field_146567_u - field_146569_s) * (double)partialTicks);
        int l = MathHelper.floor_double(field_146568_t + (field_146566_v - field_146568_t) * (double)partialTicks);

        if (k < field_146572_y)
        {
            k = field_146572_y;
        }

        if (l < field_146571_z)
        {
            l = field_146571_z;
        }

        if (k >= field_146559_A)
        {
            k = field_146559_A - 1;
        }

        if (l >= field_146560_B)
        {
            l = field_146560_B - 1;
        }

        int i1 = (width - xSize) / 2;
        int j1 = (height - ySize) / 2;
        int k1 = i1 + 16;
        int l1 = j1 + 17;
        zLevel = 0;
        GL11.glDepthFunc(GL11.GL_GEQUAL);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)k1, (float)l1, -200);
        // FIXES models rendering weirdly in the acheivements pane
        // see https://github.com/MinecraftForge/MinecraftForge/commit/1b7ce7592caafb760ec93066184182ae0711e793#commitcomment-10512284
        GL11.glScalef(1 / zoom, 1 / zoom, 1);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        int i2 = k + 288 >> 4;
        int j2 = l + 288 >> 4;
        int k2 = (k + 288) % 16;
        int l2 = (l + 288) % 16;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        Random random = new Random();
        float f1 = 16 / zoom;
        float f2 = 16 / zoom;
        int i3;
        int j3;
        int k3;

        for (i3 = 0; (float)i3 * f1 - (float)l2 < 155; ++i3)
        {
            float f3 = 0.6F - (float)(j2 + i3) / 25 * 0.3F;
            GL11.glColor4f(f3, f3, f3, 1);

            for (j3 = 0; (float)j3 * f2 - (float)k2 < 224; ++j3)
            {
                random.setSeed((long)(mc.getSession().getPlayerID().hashCode() + i2 + j3 + (j2 + i3) * 16));
                k3 = random.nextInt(1 + j2 + i3) + (j2 + i3) / 2;
                IIcon iicon = Blocks.sand.getIcon(0, 0);
                iicon = ModBlocks.lightForcestone.getIcon(2, 0);
                
                
//                if (k3 <= 37 && j2 + i3 != 35)
//                {
//                    if (k3 == 22)
//                    {
//                        if (random.nextInt(2) == 0)
//                        {
//                            iicon = Blocks.diamond_ore.getIcon(0, 0);
//                        }
//                        else
//                        {
//                            iicon = Blocks.redstone_ore.getIcon(0, 0);
//                        }
//                    }
//                    else if (k3 == 10)
//                    {
//                        iicon = Blocks.iron_ore.getIcon(0, 0);
//                    }
//                    else if (k3 == 8)
//                    {
//                        iicon = Blocks.coal_ore.getIcon(0, 0);
//                    }
//                    else if (k3 > 4)
//                    {
//                        iicon = ModBlocks.darkForcestone.getIcon(0, 0);
//                    }
//                    else if (k3 > 0)
//                    {
//                        iicon = Blocks.dirt.getIcon(0, 0);
//                    }
//                }
//                else
//                {
//                    iicon = Blocks.bedrock.getIcon(0, 0);
//                }

                mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
                drawTexturedModelRectFromIcon(j3 * 16 - k2, i3 * 16 - l2, iicon, 16, 16);
            }
        }

        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glDepthFunc(GL11.GL_LEQUAL);
        mc.getTextureManager().bindTexture(textures);
        int i4;
        int j4;
        int l4;

        for (i3 = 0; i3 < powers.size(); ++i3)
        {
            Power power1 = powers.get(i3);

            if (power1.parent != null && powers.contains(power1.parent))
            {
                j3 = power1.xOffset * 24 - k + 11;
                k3 = power1.yOffset * 24 - l + 11;
                l4 = power1.parent.xOffset * 24 - k + 11;
                int l3 = power1.parent.yOffset * 24 - l + 11;
                boolean flag5 = powerManager.hasPowerUnlocked(power1);
                boolean flag6 = powerManager.canUnlockPower(power1);
                i4 = powerManager.getHierarchy(power1);

                if (i4 <= 4)
                {
                    j4 = -16777216;

                    if (flag5)
                    {
                        j4 = -6250336;
                    }
                    else if (flag6)
                    {
                        j4 = -16711936;
                    }

                    Tessellator tessellator = Tessellator.instance;
                    float prevLineWidth = GL11.glGetFloat(GL11.GL_LINE_WIDTH);
                    GL11.glLineWidth(2 / zoom);
                    GL11.glEnable(GL11.GL_BLEND);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                    float f5 = (float)(j4 >> 24 & 255) / 255.0F;
                    float f = (float)(j4 >> 16 & 255) / 255.0F;
                    float f3 = (float)(j4 >> 8 & 255) / 255.0F;
                    float f4 = (float)(j4 & 255) / 255.0F;
                    GL11.glColor4f(f, f3, f4, f5);
                    tessellator.startDrawing(3);
                    tessellator.addVertex(j3, k3, 0);
                    tessellator.addVertex(l4, l3, 0);
                    tessellator.draw();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    GL11.glDisable(GL11.GL_BLEND);
                    GL11.glLineWidth(prevLineWidth);
                }
            }
        }

        Power power = null;
        float f4 = (float)(mouseX - k1) * zoom;
        float f5 = (float)(mouseY - l1) * zoom;
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        int i5;
        int j5;

        for (l4 = 0; l4 < powers.size(); ++l4)
        {
            Power power1 = (Power)powers.get(l4);
            i5 = power1.xOffset * 24 - k;
            j5 = power1.yOffset * 24 - l;

            if (i5 >= -24 && j5 >= -24 && (float)i5 <= 224 * zoom && (float)j5 <= 155 * zoom)
            {
                i4 = powerManager.getHierarchy(power1);
                float f6;

                if (powerManager.hasPowerUnlocked(power1))
                {
                    f6 = 0.75F;
                    GL11.glColor4f(f6, f6, f6, 1);
                }
                else if (powerManager.canUnlockPower(power1))
                {
                    f6 = 1;
                    GL11.glColor4f(f6, f6, f6, 1);
                }
                else if (i4 < 3)
                {
                    f6 = 0.3F;
                    GL11.glColor4f(f6, f6, f6, 1);
                }
                else if (i4 == 3)
                {
                    f6 = 0.2F;
                    GL11.glColor4f(f6, f6, f6, 1);
                }
                else
                {
                    if (i4 != 4)
                    {
                        continue;
                    }

                    f6 = 0.1F;
                    GL11.glColor4f(f6, f6, f6, 1);
                }

                mc.getTextureManager().bindTexture(textures);

                GL11.glEnable(GL11.GL_BLEND);// Forge: Specifically enable blend because it is needed here. And we fix Generic RenderItem's leakage of it.
                drawTexturedModalRect(i5 - 2, j5 - 2, 0, 202, 26, 26);

                if (!powerManager.canUnlockPower(power1))
                {
                    f6 = 0.1F;
                    GL11.glColor4f(f6, f6, f6, 1);
                }

                GL11.glDisable(GL11.GL_LIGHTING); //Forge: Make sure Lighting is disabled. Fixes MC-33065
                GL11.glEnable(GL11.GL_CULL_FACE);
                mc.getTextureManager().bindTexture(icons);
                drawTexturedModalRect(i5 + 3, j5 + 3, power1.iconX * 16, power1.iconY * 16, 16, 16);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GL11.glDisable(GL11.GL_LIGHTING);
                GL11.glDisable(GL11.GL_BLEND); //Forge: Cleanup states we set.

                GL11.glColor4f(1, 1, 1, 1);

                if (f4 >= (float)i5 && f4 <= (float)(i5 + 22) && f5 >= (float)j5 && f5 <= (float)(j5 + 22))
                {
                    power = power1;
                }
            }
        }

        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glPopMatrix();
        GL11.glColor4f(1, 1, 1, 1);
        mc.getTextureManager().bindTexture(textures);
        drawTexturedModalRect(i1, j1, 0, 0, xSize, ySize);
        zLevel = 0;
        GL11.glDepthFunc(GL11.GL_LEQUAL);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        super.drawScreen(mouseX, mouseY, partialTicks);

        // Tooltip
        if (power != null)
        {
            String s1 = power.getNameTranslated();
            String s2 = /*power.getDescription()*/"";
            i5 = mouseX + 12;
            j5 = mouseY - 4;
            i4 = powerManager.getHierarchy(power);

            if (!powerManager.canUnlockPower(power))
            {
                String s;
                int k4;

                if (i4 == 3)
                {
                    s1 = I18n.format("achievement.unknown");
                    j4 = Math.max(fontRendererObj.getStringWidth(s1), 120);
                    s = (new ChatComponentTranslation("achievement.requires", new Object[] {power.getNameTranslated()})).getUnformattedText();
                    k4 = fontRendererObj.splitStringWidth(s, j4);
                    drawGradientRect(i5 - 3, j5 - 3, i5 + j4 + 3, j5 + k4 + 12 + 3, -1073741824, -1073741824);
                    fontRendererObj.drawSplitString(s, i5, j5 + 12, j4, -9416624);
                }
                else if (i4 < 3)
                {
                    j4 = Math.max(fontRendererObj.getStringWidth(s1), 120);
                    s = (new ChatComponentTranslation("achievement.requires", new Object[] {power.parent.getNameTranslated()})).getUnformattedText();
                    k4 = fontRendererObj.splitStringWidth(s, j4);
                    drawGradientRect(i5 - 3, j5 - 3, i5 + j4 + 3, j5 + k4 + 12 + 3, -1073741824, -1073741824);
                    fontRendererObj.drawSplitString(s, i5, j5 + 12, j4, -9416624);
                }
                else
                {
                    s1 = null;
                }
            }
            else
            {
                j4 = Math.max(fontRendererObj.getStringWidth(s1), 120);
                int k5 = fontRendererObj.splitStringWidth(s2, j4) + 12;
                
                List<String> list = Lists.newArrayList();
                PowerStats stats = power.powerStats;
                
                if (stats.xpCost > 0)
                {
                	list.add((mc.thePlayer.experienceTotal < stats.xpCost ? EnumChatFormatting.RED : "") + I18n.format("forcepower.cost", stats.xpCost));
                }
                
                if (stats.basePowerRequirement > 0)
                {
                	list.add(I18n.format("forcepower.basePowerReq", stats.basePowerRequirement));
                }
                
                if (stats.forcePowerUseCost > 0)
                {
                	list.add(I18n.format(stats.powerType == EnumPowerType.PER_USE ? "forcepower.perUse" : "forcepower.perSecond", stats.forcePowerUseCost));
                }
                
                if (stats.basePowerBonus > 0)
                {
                	list.add(I18n.format("forcepower.basePower", (stats.basePowerBonus < 0 ? "-" : "+") + stats.basePowerBonus));
                }
                
                if (stats.forcePowerBonus > 0)
                {
                	list.add(I18n.format("forcepower.forcePower", (stats.forcePowerBonus < 0 ? "-" : "+") + stats.forcePowerBonus));
                }
                
                if (stats.forcePowerRegen > 0)
                {
                	list.add(I18n.format("forcepower.forceRegen", (stats.forcePowerRegen < 0 ? "-" : "+") + stats.forcePowerRegen + (stats.forcePowerRegenOperation == 1 ? "%" : "")));
                }

                drawGradientRect(i5 - 3, j5 - 3, i5 + j4 + 3, j5 + k5 + 6 + (2 + fontRendererObj.FONT_HEIGHT) * list.size(), -1073741824, -1073741824);
                fontRendererObj.drawSplitString(s2, i5, j5 + 12, j4, -6250336);
                int height = j5 + fontRendererObj.FONT_HEIGHT + 4;
                
                for (String s : list)
                {
                	fontRendererObj.drawStringWithShadow(s, i5, height, 0xa4a4a4);
                	height += 2 + fontRendererObj.FONT_HEIGHT;
                }
                
                if (powerManager.hasPowerUnlocked(power))
                {
                    fontRendererObj.drawStringWithShadow(I18n.format("forcepower.unlocked"), i5, height + 3, -7302913);
                }
                else
                {
                	PowerData data = powerManager.getPowerData(mc.thePlayer, power);
                	fontRendererObj.drawStringWithShadow(I18n.format("forcepower.xpLeft", power.powerStats.xpCost - data.xpInvested), i5, height + 3, -7302913);
                }
            }

            if (s1 != null)
            {
                fontRendererObj.drawStringWithShadow(s1, i5, j5, powerManager.canUnlockPower(power) ? -1 : -8355712);
            }
            
            if (Mouse.isButtonDown(0) && ALHelper.getTotalXp(mc.thePlayer) > 0 && !powerManager.getPowerData(power).unlocked && powerManager.canUnlockPower(power))
            {
            	ALData.set(mc.thePlayer, ALData.DRAINING_XP_TO, power.getName());
            }
            else
            {
            	ALData.set(mc.thePlayer, ALData.DRAINING_XP_TO, "");
            }
        }
        else
        {
        	ALData.set(mc.thePlayer, ALData.DRAINING_XP_TO, "");
        }

        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_LIGHTING);
        RenderHelper.disableStandardItemLighting();
    }

    public boolean doesGuiPauseGame()
    {
        return false;
    }
}

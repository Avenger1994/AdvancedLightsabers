package fiskfille.lightsabers.client.render.item;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import fiskfille.lightsabers.common.tileentity.TileEntityLightsaberForge;
import fiskfille.lightsabers.common.tileentity.TileEntitySithCoffin;

public class RenderItemSithCoffin implements IItemRenderer
{
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
    	float scale = 0.6F;
        GL11.glScalef(scale, scale, scale);
        
        if (type == type.ENTITY || type == type.INVENTORY)
        {
        	GL11.glTranslatef(0.5F, -0.8F, 1.0F);
        }
        else if (type == type.EQUIPPED)
        {
        	GL11.glTranslatef(1.5F, 0.0F, 1.5F);
        }
        else if (type == type.EQUIPPED_FIRST_PERSON || type == type.FIRST_PERSON_MAP)
        {
        	GL11.glTranslatef(1.5F, 0.0F, 1.5F);
        }
        
        GL11.glRotatef(180, 0, 1, 0);
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySithCoffin(), 0.0F, 0.0F, 0.0F, 0.0F);
    }
}

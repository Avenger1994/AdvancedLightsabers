package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionGraflex extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer switch1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body9;
    public ModelRenderer body8;
    public ModelRenderer switch2;

    public ModelSwitchSectionGraflex()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body5 = new ModelRenderer(this, 0, 0);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 0);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 0);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        this.body4 = new ModelRenderer(this, 0, 0);
        this.body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        this.switch2 = new ModelRenderer(this, 8, 3);
        this.switch2.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.switch2.addBox(-1.0F, -1.5F, -1.0F, 2, 9, 1, 0.0F);
        this.setRotateAngle(switch2, 0.10471975511965977F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 0);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body7 = new ModelRenderer(this, 0, 0);
        this.body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        this.body8 = new ModelRenderer(this, 0, 11);
        this.body8.setRotationPoint(0.0F, -4.0F, 3.0F);
        this.body8.addBox(-1.5F, -4.0F, 0.0F, 3, 8, 2, 0.0F);
        this.switch1 = new ModelRenderer(this, 8, 0);
        this.switch1.setRotationPoint(-4.7F, -6.0F, -1.4F);
        this.switch1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.body9 = new ModelRenderer(this, 0, 0);
        this.body9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body9.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.setRotateAngle(body9, 0.0F, -0.7853981633974483F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        this.body1.addChild(this.body5);
        this.body1.addChild(this.body2);
        this.body1.addChild(this.body6);
        this.body1.addChild(this.body4);
        this.switch1.addChild(this.switch2);
        this.body1.addChild(this.body3);
        this.body1.addChild(this.body7);
        this.body7.addChild(this.body8);
        this.body1.addChild(this.body9);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.switch1.offsetX, this.switch1.offsetY, this.switch1.offsetZ);
        GL11.glTranslatef(this.switch1.rotationPointX * f5, this.switch1.rotationPointY * f5, this.switch1.rotationPointZ * f5);
        GL11.glScaled(0.6D, 0.6D, 0.6D);
        GL11.glTranslatef(-this.switch1.offsetX, -this.switch1.offsetY, -this.switch1.offsetZ);
        GL11.glTranslatef(-this.switch1.rotationPointX * f5, -this.switch1.rotationPointY * f5, -this.switch1.rotationPointZ * f5);
        this.switch1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.body1.offsetX, this.body1.offsetY, this.body1.offsetZ);
        GL11.glTranslatef(this.body1.rotationPointX * f5, this.body1.rotationPointY * f5, this.body1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.1D, 1.1D);
        GL11.glTranslatef(-this.body1.offsetX, -this.body1.offsetY, -this.body1.offsetZ);
        GL11.glTranslatef(-this.body1.rotationPointX * f5, -this.body1.rotationPointY * f5, -this.body1.rotationPointZ * f5);
        this.body1.render(f5);
        GL11.glPopMatrix();
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

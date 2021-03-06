package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelBodyMauler extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer cylinder1;
    public ModelRenderer ring5_1;
    public ModelRenderer ring4_1;
    public ModelRenderer ring3_1;
    public ModelRenderer ring2_1;
    public ModelRenderer ring1_1;
    public ModelRenderer upperCylinder1;
    public ModelRenderer button1_1;
    public ModelRenderer button2_1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer cylinder2;
    public ModelRenderer cylinder3;
    public ModelRenderer cylinder4;
    public ModelRenderer cylinder5;
    public ModelRenderer cylinder6;
    public ModelRenderer cylinder7;
    public ModelRenderer cylinder8;
    public ModelRenderer ring5_2;
    public ModelRenderer ring5_3;
    public ModelRenderer ring5_4;
    public ModelRenderer ring5_5;
    public ModelRenderer ring5_6;
    public ModelRenderer ring5_7;
    public ModelRenderer ring5_8;
    public ModelRenderer ring4_2;
    public ModelRenderer ring4_3;
    public ModelRenderer ring4_4;
    public ModelRenderer ring4_5;
    public ModelRenderer ring4_6;
    public ModelRenderer ring4_7;
    public ModelRenderer ring4_8;
    public ModelRenderer ring3_2;
    public ModelRenderer ring3_3;
    public ModelRenderer ring3_4;
    public ModelRenderer ring3_5;
    public ModelRenderer ring3_6;
    public ModelRenderer ring3_7;
    public ModelRenderer ring3_8;
    public ModelRenderer ring2_2;
    public ModelRenderer ring2_3;
    public ModelRenderer ring2_4;
    public ModelRenderer ring2_5;
    public ModelRenderer ring2_6;
    public ModelRenderer ring2_7;
    public ModelRenderer ring2_8;
    public ModelRenderer ring1_2;
    public ModelRenderer ring1_3;
    public ModelRenderer ring1_4;
    public ModelRenderer ring1_5;
    public ModelRenderer ring1_6;
    public ModelRenderer ring1_7;
    public ModelRenderer ring1_8;
    public ModelRenderer upperCylinder2;
    public ModelRenderer upperCylinder3;
    public ModelRenderer upperCylinder4;
    public ModelRenderer upperCylinder5;
    public ModelRenderer upperCylinder6;
    public ModelRenderer upperCylinder7;
    public ModelRenderer upperCylinder8;
    public ModelRenderer button1_2;
    public ModelRenderer button1_3;
    public ModelRenderer button1_4;
    public ModelRenderer button1_5;
    public ModelRenderer button1_6;
    public ModelRenderer button1_7;
    public ModelRenderer button1_8;
    public ModelRenderer button2_2;
    public ModelRenderer button2_3;
    public ModelRenderer button2_4;
    public ModelRenderer button2_5;
    public ModelRenderer button2_6;
    public ModelRenderer button2_7;
    public ModelRenderer button2_8;

    public ModelBodyMauler()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.upperCylinder1 = new ModelRenderer(this, 0, 17);
        this.upperCylinder1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder1.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.button1_3 = new ModelRenderer(this, 8, 0);
        this.button1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring1_8 = new ModelRenderer(this, 8, 14);
        this.ring1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_8.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring5_5 = new ModelRenderer(this, 8, 14);
        this.ring5_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_5.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_5, 0.0F, 3.141592653589793F, 0.0F);
        this.ring5_8 = new ModelRenderer(this, 8, 14);
        this.ring5_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_8.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring4_4 = new ModelRenderer(this, 8, 14);
        this.ring4_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_4.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_4, 0.0F, 2.356194490192345F, 0.0F);
        this.upperCylinder2 = new ModelRenderer(this, 0, 17);
        this.upperCylinder2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder2.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button2_3 = new ModelRenderer(this, 8, 7);
        this.button2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring4_2 = new ModelRenderer(this, 8, 14);
        this.ring4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_2.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.ring2_2 = new ModelRenderer(this, 8, 14);
        this.ring2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_2.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.body4 = new ModelRenderer(this, 0, 0);
        this.body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring1_1 = new ModelRenderer(this, 8, 14);
        this.ring1_1.setRotationPoint(0.0F, 5.8F, 0.0F);
        this.ring1_1.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.ring3_8 = new ModelRenderer(this, 8, 14);
        this.ring3_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_8.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.button1_5 = new ModelRenderer(this, 8, 0);
        this.button1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_7 = new ModelRenderer(this, 8, 7);
        this.button2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.cylinder4 = new ModelRenderer(this, 0, 13);
        this.cylinder4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder4.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring3_7 = new ModelRenderer(this, 8, 14);
        this.ring3_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_7.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring2_3 = new ModelRenderer(this, 8, 14);
        this.ring2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_3.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 0);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        this.button2_5 = new ModelRenderer(this, 8, 7);
        this.button2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_5, 0.0F, 3.141592653589793F, 0.0F);
        this.ring4_5 = new ModelRenderer(this, 8, 14);
        this.ring4_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_5.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_4 = new ModelRenderer(this, 8, 7);
        this.button2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_4, 0.0F, 2.356194490192345F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.body1.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.ring1_3 = new ModelRenderer(this, 8, 14);
        this.ring1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_3.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body8 = new ModelRenderer(this, 0, 0);
        this.body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring4_1 = new ModelRenderer(this, 8, 14);
        this.ring4_1.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.ring4_1.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.button2_6 = new ModelRenderer(this, 8, 7);
        this.button2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_6, 0.0F, -2.356194490192345F, 0.0F);
        this.ring1_7 = new ModelRenderer(this, 8, 14);
        this.ring1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_7.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.cylinder2 = new ModelRenderer(this, 0, 13);
        this.cylinder2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder2.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button2_2 = new ModelRenderer(this, 8, 7);
        this.button2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.upperCylinder7 = new ModelRenderer(this, 0, 17);
        this.upperCylinder7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder7.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring1_4 = new ModelRenderer(this, 8, 14);
        this.ring1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_4.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring4_6 = new ModelRenderer(this, 8, 14);
        this.ring4_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_6.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_6, 0.0F, -2.356194490192345F, 0.0F);
        this.ring4_8 = new ModelRenderer(this, 8, 14);
        this.ring4_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_8.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.cylinder5 = new ModelRenderer(this, 0, 13);
        this.cylinder5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder5.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder5, 0.0F, 3.141592653589793F, 0.0F);
        this.button1_7 = new ModelRenderer(this, 8, 0);
        this.button1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring1_2 = new ModelRenderer(this, 8, 14);
        this.ring1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_2.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.ring3_1 = new ModelRenderer(this, 8, 14);
        this.ring3_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.ring3_1.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.ring3_3 = new ModelRenderer(this, 8, 14);
        this.ring3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_3.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring2_7 = new ModelRenderer(this, 8, 14);
        this.ring2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_7.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring3_4 = new ModelRenderer(this, 8, 14);
        this.ring3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_4.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_4, 0.0F, 2.356194490192345F, 0.0F);
        this.upperCylinder6 = new ModelRenderer(this, 0, 17);
        this.upperCylinder6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder6.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder6, 0.0F, -2.356194490192345F, 0.0F);
        this.ring5_6 = new ModelRenderer(this, 8, 14);
        this.ring5_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_6.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_6, 0.0F, -2.356194490192345F, 0.0F);
        this.ring3_5 = new ModelRenderer(this, 8, 14);
        this.ring3_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_5.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_1 = new ModelRenderer(this, 8, 7);
        this.button2_1.setRotationPoint(0.0F, 16.5F, -3.62F);
        this.button2_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_1, 1.5707963267948966F, 0.0F, 0.0F);
        this.button1_1 = new ModelRenderer(this, 8, 0);
        this.button1_1.setRotationPoint(0.0F, 12.0F, -3.62F);
        this.button1_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_1, 1.5707963267948966F, 0.0F, 0.0F);
        this.upperCylinder8 = new ModelRenderer(this, 0, 17);
        this.upperCylinder8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder8.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring2_6 = new ModelRenderer(this, 8, 14);
        this.ring2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_6.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_6, 0.0F, -2.356194490192345F, 0.0F);
        this.button1_6 = new ModelRenderer(this, 8, 0);
        this.button1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_6, 0.0F, -2.356194490192345F, 0.0F);
        this.upperCylinder4 = new ModelRenderer(this, 0, 17);
        this.upperCylinder4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder4.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring1_5 = new ModelRenderer(this, 8, 14);
        this.ring1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_5.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_8 = new ModelRenderer(this, 8, 7);
        this.button2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring2_8 = new ModelRenderer(this, 8, 14);
        this.ring2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_8.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring3_6 = new ModelRenderer(this, 8, 14);
        this.ring3_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_6.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_6, 0.0F, -2.356194490192345F, 0.0F);
        this.cylinder7 = new ModelRenderer(this, 0, 13);
        this.cylinder7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder7.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring5_7 = new ModelRenderer(this, 8, 14);
        this.ring5_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_7.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.cylinder6 = new ModelRenderer(this, 0, 13);
        this.cylinder6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder6.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder6, 0.0F, -2.356194490192345F, 0.0F);
        this.cylinder1 = new ModelRenderer(this, 0, 13);
        this.cylinder1.setRotationPoint(0.0F, 6.6F, 0.0F);
        this.cylinder1.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.ring2_4 = new ModelRenderer(this, 8, 14);
        this.ring2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_4.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_4, 0.0F, 2.356194490192345F, 0.0F);
        this.button1_2 = new ModelRenderer(this, 8, 0);
        this.button1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 0);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        this.ring5_2 = new ModelRenderer(this, 8, 14);
        this.ring5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_2.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button1_4 = new ModelRenderer(this, 8, 0);
        this.button1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring5_4 = new ModelRenderer(this, 8, 14);
        this.ring5_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_4.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_4, 0.0F, 2.356194490192345F, 0.0F);
        this.ring1_6 = new ModelRenderer(this, 8, 14);
        this.ring1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring1_6.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring1_6, 0.0F, -2.356194490192345F, 0.0F);
        this.button1_8 = new ModelRenderer(this, 8, 0);
        this.button1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.cylinder8 = new ModelRenderer(this, 0, 13);
        this.cylinder8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder8.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder8, 0.0F, -0.7853981633974483F, 0.0F);
        this.ring5_3 = new ModelRenderer(this, 8, 14);
        this.ring5_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring5_3.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring5_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring5_1 = new ModelRenderer(this, 8, 14);
        this.ring5_1.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.ring5_1.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.upperCylinder5 = new ModelRenderer(this, 0, 17);
        this.upperCylinder5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder5.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder5, 0.0F, 3.141592653589793F, 0.0F);
        this.cylinder3 = new ModelRenderer(this, 0, 13);
        this.cylinder3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinder3.addBox(-1.5F, 0.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(cylinder3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body5 = new ModelRenderer(this, 0, 0);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        this.body7 = new ModelRenderer(this, 0, 0);
        this.body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring2_1 = new ModelRenderer(this, 8, 14);
        this.ring2_1.setRotationPoint(0.0F, 4.4F, 0.0F);
        this.ring2_1.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.upperCylinder3 = new ModelRenderer(this, 0, 17);
        this.upperCylinder3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperCylinder3.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        this.setRotateAngle(upperCylinder3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 0);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addBox(-1.5F, 0.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring4_3 = new ModelRenderer(this, 8, 14);
        this.ring4_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_3.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.ring2_5 = new ModelRenderer(this, 8, 14);
        this.ring2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring2_5.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring2_5, 0.0F, 3.141592653589793F, 0.0F);
        this.ring4_7 = new ModelRenderer(this, 8, 14);
        this.ring4_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring4_7.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring4_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.ring3_2 = new ModelRenderer(this, 8, 14);
        this.ring3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ring3_2.addBox(-1.5F, 0.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(ring3_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button1_1.addChild(this.button1_3);
        this.ring1_1.addChild(this.ring1_8);
        this.ring5_1.addChild(this.ring5_5);
        this.ring5_1.addChild(this.ring5_8);
        this.ring4_1.addChild(this.ring4_4);
        this.upperCylinder1.addChild(this.upperCylinder2);
        this.button2_1.addChild(this.button2_3);
        this.ring4_1.addChild(this.ring4_2);
        this.ring2_1.addChild(this.ring2_2);
        this.body1.addChild(this.body4);
        this.ring3_1.addChild(this.ring3_8);
        this.button1_1.addChild(this.button1_5);
        this.button2_1.addChild(this.button2_7);
        this.cylinder1.addChild(this.cylinder4);
        this.ring3_1.addChild(this.ring3_7);
        this.ring2_1.addChild(this.ring2_3);
        this.body1.addChild(this.body6);
        this.button2_1.addChild(this.button2_5);
        this.ring4_1.addChild(this.ring4_5);
        this.button2_1.addChild(this.button2_4);
        this.ring1_1.addChild(this.ring1_3);
        this.body1.addChild(this.body8);
        this.button2_1.addChild(this.button2_6);
        this.ring1_1.addChild(this.ring1_7);
        this.cylinder1.addChild(this.cylinder2);
        this.button2_1.addChild(this.button2_2);
        this.upperCylinder1.addChild(this.upperCylinder7);
        this.ring1_1.addChild(this.ring1_4);
        this.ring4_1.addChild(this.ring4_6);
        this.ring4_1.addChild(this.ring4_8);
        this.cylinder1.addChild(this.cylinder5);
        this.button1_1.addChild(this.button1_7);
        this.ring1_1.addChild(this.ring1_2);
        this.ring3_1.addChild(this.ring3_3);
        this.ring2_1.addChild(this.ring2_7);
        this.ring3_1.addChild(this.ring3_4);
        this.upperCylinder1.addChild(this.upperCylinder6);
        this.ring5_1.addChild(this.ring5_6);
        this.ring3_1.addChild(this.ring3_5);
        this.upperCylinder1.addChild(this.upperCylinder8);
        this.ring2_1.addChild(this.ring2_6);
        this.button1_1.addChild(this.button1_6);
        this.upperCylinder1.addChild(this.upperCylinder4);
        this.ring1_1.addChild(this.ring1_5);
        this.button2_1.addChild(this.button2_8);
        this.ring2_1.addChild(this.ring2_8);
        this.ring3_1.addChild(this.ring3_6);
        this.cylinder1.addChild(this.cylinder7);
        this.ring5_1.addChild(this.ring5_7);
        this.cylinder1.addChild(this.cylinder6);
        this.ring2_1.addChild(this.ring2_4);
        this.button1_1.addChild(this.button1_2);
        this.body1.addChild(this.body2);
        this.ring5_1.addChild(this.ring5_2);
        this.button1_1.addChild(this.button1_4);
        this.ring5_1.addChild(this.ring5_4);
        this.ring1_1.addChild(this.ring1_6);
        this.button1_1.addChild(this.button1_8);
        this.cylinder1.addChild(this.cylinder8);
        this.ring5_1.addChild(this.ring5_3);
        this.upperCylinder1.addChild(this.upperCylinder5);
        this.cylinder1.addChild(this.cylinder3);
        this.body1.addChild(this.body5);
        this.body1.addChild(this.body7);
        this.upperCylinder1.addChild(this.upperCylinder3);
        this.body1.addChild(this.body3);
        this.ring4_1.addChild(this.ring4_3);
        this.ring2_1.addChild(this.ring2_5);
        this.ring4_1.addChild(this.ring4_7);
        this.ring3_1.addChild(this.ring3_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.upperCylinder1.offsetX, this.upperCylinder1.offsetY, this.upperCylinder1.offsetZ);
        GL11.glTranslatef(this.upperCylinder1.rotationPointX * f5, this.upperCylinder1.rotationPointY * f5, this.upperCylinder1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.1D, 1.1D);
        GL11.glTranslatef(-this.upperCylinder1.offsetX, -this.upperCylinder1.offsetY, -this.upperCylinder1.offsetZ);
        GL11.glTranslatef(-this.upperCylinder1.rotationPointX * f5, -this.upperCylinder1.rotationPointY * f5, -this.upperCylinder1.rotationPointZ * f5);
        this.upperCylinder1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.ring1_1.offsetX, this.ring1_1.offsetY, this.ring1_1.offsetZ);
        GL11.glTranslatef(this.ring1_1.rotationPointX * f5, this.ring1_1.rotationPointY * f5, this.ring1_1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 0.8D, 1.2D);
        GL11.glTranslatef(-this.ring1_1.offsetX, -this.ring1_1.offsetY, -this.ring1_1.offsetZ);
        GL11.glTranslatef(-this.ring1_1.rotationPointX * f5, -this.ring1_1.rotationPointY * f5, -this.ring1_1.rotationPointZ * f5);
        this.ring1_1.render(f5);
        GL11.glPopMatrix();
        this.body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.ring4_1.offsetX, this.ring4_1.offsetY, this.ring4_1.offsetZ);
        GL11.glTranslatef(this.ring4_1.rotationPointX * f5, this.ring4_1.rotationPointY * f5, this.ring4_1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 0.8D, 1.2D);
        GL11.glTranslatef(-this.ring4_1.offsetX, -this.ring4_1.offsetY, -this.ring4_1.offsetZ);
        GL11.glTranslatef(-this.ring4_1.rotationPointX * f5, -this.ring4_1.rotationPointY * f5, -this.ring4_1.rotationPointZ * f5);
        this.ring4_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.ring3_1.offsetX, this.ring3_1.offsetY, this.ring3_1.offsetZ);
        GL11.glTranslatef(this.ring3_1.rotationPointX * f5, this.ring3_1.rotationPointY * f5, this.ring3_1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 0.8D, 1.2D);
        GL11.glTranslatef(-this.ring3_1.offsetX, -this.ring3_1.offsetY, -this.ring3_1.offsetZ);
        GL11.glTranslatef(-this.ring3_1.rotationPointX * f5, -this.ring3_1.rotationPointY * f5, -this.ring3_1.rotationPointZ * f5);
        this.ring3_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.button2_1.offsetX, this.button2_1.offsetY, this.button2_1.offsetZ);
        GL11.glTranslatef(this.button2_1.rotationPointX * f5, this.button2_1.rotationPointY * f5, this.button2_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.button2_1.offsetX, -this.button2_1.offsetY, -this.button2_1.offsetZ);
        GL11.glTranslatef(-this.button2_1.rotationPointX * f5, -this.button2_1.rotationPointY * f5, -this.button2_1.rotationPointZ * f5);
        this.button2_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.button1_1.offsetX, this.button1_1.offsetY, this.button1_1.offsetZ);
        GL11.glTranslatef(this.button1_1.rotationPointX * f5, this.button1_1.rotationPointY * f5, this.button1_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.button1_1.offsetX, -this.button1_1.offsetY, -this.button1_1.offsetZ);
        GL11.glTranslatef(-this.button1_1.rotationPointX * f5, -this.button1_1.rotationPointY * f5, -this.button1_1.rotationPointZ * f5);
        this.button1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.cylinder1.offsetX, this.cylinder1.offsetY, this.cylinder1.offsetZ);
        GL11.glTranslatef(this.cylinder1.rotationPointX * f5, this.cylinder1.rotationPointY * f5, this.cylinder1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.0D, 1.1D);
        GL11.glTranslatef(-this.cylinder1.offsetX, -this.cylinder1.offsetY, -this.cylinder1.offsetZ);
        GL11.glTranslatef(-this.cylinder1.rotationPointX * f5, -this.cylinder1.rotationPointY * f5, -this.cylinder1.rotationPointZ * f5);
        this.cylinder1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.ring5_1.offsetX, this.ring5_1.offsetY, this.ring5_1.offsetZ);
        GL11.glTranslatef(this.ring5_1.rotationPointX * f5, this.ring5_1.rotationPointY * f5, this.ring5_1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 0.8D, 1.2D);
        GL11.glTranslatef(-this.ring5_1.offsetX, -this.ring5_1.offsetY, -this.ring5_1.offsetZ);
        GL11.glTranslatef(-this.ring5_1.rotationPointX * f5, -this.ring5_1.rotationPointY * f5, -this.ring5_1.rotationPointZ * f5);
        this.ring5_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.ring2_1.offsetX, this.ring2_1.offsetY, this.ring2_1.offsetZ);
        GL11.glTranslatef(this.ring2_1.rotationPointX * f5, this.ring2_1.rotationPointY * f5, this.ring2_1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 0.8D, 1.2D);
        GL11.glTranslatef(-this.ring2_1.offsetX, -this.ring2_1.offsetY, -this.ring2_1.offsetZ);
        GL11.glTranslatef(-this.ring2_1.rotationPointX * f5, -this.ring2_1.rotationPointY * f5, -this.ring2_1.rotationPointZ * f5);
        this.ring2_1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

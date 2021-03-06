package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelBodyFulcrum extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer front1;
    public ModelRenderer indent1;
    public ModelRenderer body2;
    public ModelRenderer body4;
    public ModelRenderer body6;
    public ModelRenderer body9;
    public ModelRenderer body12;
    public ModelRenderer body17;
    public ModelRenderer body3;
    public ModelRenderer body5;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer body10;
    public ModelRenderer body11;
    public ModelRenderer body13;
    public ModelRenderer body15;
    public ModelRenderer body14;
    public ModelRenderer body16;
    public ModelRenderer body18;
    public ModelRenderer body20;
    public ModelRenderer body22;
    public ModelRenderer body27;
    public ModelRenderer body32;
    public ModelRenderer body37;
    public ModelRenderer body19;
    public ModelRenderer body21;
    public ModelRenderer body23;
    public ModelRenderer body25;
    public ModelRenderer body26;
    public ModelRenderer body24;
    public ModelRenderer body28;
    public ModelRenderer body30;
    public ModelRenderer body31;
    public ModelRenderer body29;
    public ModelRenderer body33;
    public ModelRenderer body35;
    public ModelRenderer body34;
    public ModelRenderer body36;
    public ModelRenderer body38;
    public ModelRenderer body40;
    public ModelRenderer body42;
    public ModelRenderer body45;
    public ModelRenderer body48;
    public ModelRenderer body39;
    public ModelRenderer body41;
    public ModelRenderer body43;
    public ModelRenderer body44;
    public ModelRenderer body46;
    public ModelRenderer body47;
    public ModelRenderer body49;
    public ModelRenderer body51;
    public ModelRenderer body50;
    public ModelRenderer body52;
    public ModelRenderer front2;
    public ModelRenderer front4;
    public ModelRenderer front6;
    public ModelRenderer front7;
    public ModelRenderer front8;
    public ModelRenderer front3;
    public ModelRenderer front5;
    public ModelRenderer front9;
    public ModelRenderer front11;
    public ModelRenderer front13;
    public ModelRenderer front14;
    public ModelRenderer front10;
    public ModelRenderer front12;
    public ModelRenderer indent2;
    public ModelRenderer indent4;
    public ModelRenderer indent6;
    public ModelRenderer indent7;
    public ModelRenderer indent8;
    public ModelRenderer indent15;
    public ModelRenderer indent22;
    public ModelRenderer indent29;
    public ModelRenderer indent3;
    public ModelRenderer indent5;
    public ModelRenderer indent9;
    public ModelRenderer indent11;
    public ModelRenderer indent13;
    public ModelRenderer indent14;
    public ModelRenderer indent10;
    public ModelRenderer indent12;
    public ModelRenderer indent16;
    public ModelRenderer indent18;
    public ModelRenderer indent20;
    public ModelRenderer indent21;
    public ModelRenderer indent17;
    public ModelRenderer indent19;
    public ModelRenderer indent23;
    public ModelRenderer indent25;
    public ModelRenderer indent27;
    public ModelRenderer indent28;
    public ModelRenderer indent24;
    public ModelRenderer indent26;
    public ModelRenderer indent30;
    public ModelRenderer indent32;
    public ModelRenderer indent34;
    public ModelRenderer indent35;
    public ModelRenderer indent31;
    public ModelRenderer indent33;

    public ModelBodyFulcrum()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body12 = new ModelRenderer(this, 0, 18);
        this.body12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addBox(-1.5F, 0.0F, 2.76F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body12, 0.0F, 3.141592653589793F, 0.0F);
        this.body49 = new ModelRenderer(this, 24, 2);
        this.body49.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body49.addBox(-1.0F, 7.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body49, 0.0F, -0.46949356878647464F, 0.0F);
        this.indent21 = new ModelRenderer(this, 8, 0);
        this.indent21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent21.addBox(-2.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body25 = new ModelRenderer(this, 20, 3);
        this.body25.setRotationPoint(-2.48F, 0.0F, 0.9F);
        this.body25.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body25, 0.6108652381980153F, 0.0F, 0.0F);
        this.indent20 = new ModelRenderer(this, 8, 0);
        this.indent20.mirror = true;
        this.indent20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent20.addBox(1.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body16 = new ModelRenderer(this, 8, 18);
        this.body16.mirror = true;
        this.body16.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body16.addBox(0.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body16, 0.0F, 0.4721115626644662F, 0.0F);
        this.body7 = new ModelRenderer(this, 8, 18);
        this.body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addBox(-2.98F, 0.0F, -2.5F, 1, 12, 1, 0.0F);
        this.indent2 = new ModelRenderer(this, 16, 3);
        this.indent2.setRotationPoint(-1.5F, -0.5F, -3.76F);
        this.indent2.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent2, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent8 = new ModelRenderer(this, 13, 0);
        this.indent8.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.indent8.addBox(-1.5F, -1.0F, -3.76F, 3, 2, 1, 0.0F);
        this.front13 = new ModelRenderer(this, 44, 18);
        this.front13.mirror = true;
        this.front13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.front13.addBox(1.98F, 0.0F, -2.5F, 1, 10, 2, 0.0F);
        this.body2 = new ModelRenderer(this, 8, 18);
        this.body2.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body2.addBox(-1.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.46949356878647464F, 0.0F);
        this.body33 = new ModelRenderer(this, 24, 2);
        this.body33.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body33.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body33, 0.0F, -0.46949356878647464F, 0.0F);
        this.body6 = new ModelRenderer(this, 8, 18);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addBox(-2.98F, 0.0F, 1.5F, 1, 12, 1, 0.0F);
        this.body47 = new ModelRenderer(this, 21, 0);
        this.body47.mirror = true;
        this.body47.setRotationPoint(0.0F, -1.65F, 0.0F);
        this.body47.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(body47, -0.7853981633974483F, 0.0F, 0.0F);
        this.front11 = new ModelRenderer(this, 40, 18);
        this.front11.mirror = true;
        this.front11.setRotationPoint(1.5F, 0.5F, -3.76F);
        this.front11.addBox(0.0F, -0.5F, 0.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(front11, 0.0F, -0.46949356878647464F, 0.0F);
        this.body17 = new ModelRenderer(this, 20, 18);
        this.body17.setRotationPoint(0.0F, 11.7F, 0.0F);
        this.body17.addBox(-1.5F, 0.0F, 2.76F, 3, 10, 1, 0.0F);
        this.setRotateAngle(body17, 0.03490658503988659F, 0.0F, 0.0F);
        this.front8 = new ModelRenderer(this, 32, 18);
        this.front8.setRotationPoint(0.0F, 10.7F, 0.0F);
        this.front8.addBox(-1.5F, 0.0F, -3.76F, 3, 10, 1, 0.0F);
        this.setRotateAngle(front8, 0.05235987755982988F, 0.0F, 0.0F);
        this.body15 = new ModelRenderer(this, 8, 18);
        this.body15.mirror = true;
        this.body15.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body15.addBox(0.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body15, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent30 = new ModelRenderer(this, 16, 3);
        this.indent30.setRotationPoint(-1.5F, -0.5F, -3.76F);
        this.indent30.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent30, 0.0F, 0.46949356878647464F, 0.0F);
        this.body31 = new ModelRenderer(this, 20, 3);
        this.body31.mirror = true;
        this.body31.setRotationPoint(2.48F, 0.0F, -0.9F);
        this.body31.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body31, 0.9599310885968813F, 0.0F, 0.0F);
        this.front7 = new ModelRenderer(this, 46, 5);
        this.front7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.front7.addBox(-2.98F, 0.0F, -2.5F, 1, 11, 2, 0.0F);
        this.body50 = new ModelRenderer(this, 24, 2);
        this.body50.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body50.addBox(-1.0F, 7.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body50, 0.0F, -0.4721115626644662F, 0.0F);
        this.indent15 = new ModelRenderer(this, 13, 0);
        this.indent15.setRotationPoint(0.0F, 8.5F, 0.05F);
        this.indent15.addBox(-1.5F, -1.0F, -3.76F, 3, 2, 1, 0.0F);
        this.setRotateAngle(indent15, 0.02617993877991494F, 0.0F, 0.0F);
        this.indent1 = new ModelRenderer(this, 13, 0);
        this.indent1.setRotationPoint(0.0F, 13.6F, 0.1F);
        this.indent1.addBox(-1.5F, -1.0F, -3.76F, 3, 2, 1, 0.0F);
        this.setRotateAngle(indent1, 0.03490658503988659F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 18);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addBox(-1.5F, 0.0F, 2.76F, 3, 12, 1, 0.0F);
        this.indent4 = new ModelRenderer(this, 16, 3);
        this.indent4.mirror = true;
        this.indent4.setRotationPoint(1.5F, -0.5F, -3.76F);
        this.indent4.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent4, 0.0F, -0.46949356878647464F, 0.0F);
        this.body24 = new ModelRenderer(this, 21, 0);
        this.body24.setRotationPoint(0.0F, 1.65F, 0.0F);
        this.body24.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(body24, 0.7853981633974483F, 0.0F, 0.0F);
        this.body29 = new ModelRenderer(this, 21, 0);
        this.body29.mirror = true;
        this.body29.setRotationPoint(0.0F, 1.65F, 0.0F);
        this.body29.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(body29, 0.7853981633974483F, 0.0F, 0.0F);
        this.body52 = new ModelRenderer(this, 24, 2);
        this.body52.mirror = true;
        this.body52.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body52.addBox(0.0F, 7.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body52, 0.0F, 0.4721115626644662F, 0.0F);
        this.indent29 = new ModelRenderer(this, 13, 0);
        this.indent29.setRotationPoint(0.0F, 17.2F, 0.45F);
        this.indent29.addBox(-1.5F, -1.0F, -3.76F, 3, 2, 1, 0.0F);
        this.setRotateAngle(indent29, 0.05235987755982988F, 0.0F, 0.0F);
        this.indent11 = new ModelRenderer(this, 16, 3);
        this.indent11.mirror = true;
        this.indent11.setRotationPoint(1.5F, -0.5F, -3.76F);
        this.indent11.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent11, 0.0F, -0.46949356878647464F, 0.0F);
        this.body38 = new ModelRenderer(this, 30, 8);
        this.body38.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body38.addBox(-1.0F, -0.5F, -1.0F, 1, 9, 1, 0.0F);
        this.setRotateAngle(body38, 0.0F, -0.46949356878647464F, 0.0F);
        this.body19 = new ModelRenderer(this, 28, 18);
        this.body19.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body19.addBox(-1.0F, -0.5F, -1.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(body19, 0.0F, -0.4721115626644662F, 0.0F);
        this.body20 = new ModelRenderer(this, 28, 18);
        this.body20.mirror = true;
        this.body20.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body20.addBox(0.0F, -0.5F, -1.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(body20, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent16 = new ModelRenderer(this, 16, 3);
        this.indent16.setRotationPoint(-1.5F, -0.5F, -3.76F);
        this.indent16.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent16, 0.0F, 0.46949356878647464F, 0.0F);
        this.body18 = new ModelRenderer(this, 28, 18);
        this.body18.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body18.addBox(-1.0F, -0.5F, -1.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(body18, 0.0F, -0.46949356878647464F, 0.0F);
        this.front4 = new ModelRenderer(this, 42, 6);
        this.front4.mirror = true;
        this.front4.setRotationPoint(1.5F, 0.5F, -3.76F);
        this.front4.addBox(0.0F, -0.5F, 0.0F, 1, 11, 1, 0.0F);
        this.setRotateAngle(front4, 0.0F, -0.46949356878647464F, 0.0F);
        this.front12 = new ModelRenderer(this, 40, 18);
        this.front12.mirror = true;
        this.front12.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.front12.addBox(0.0F, -0.5F, 0.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(front12, 0.0F, -0.4721115626644662F, 0.0F);
        this.indent23 = new ModelRenderer(this, 16, 3);
        this.indent23.setRotationPoint(-1.5F, -0.5F, -3.76F);
        this.indent23.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent23, 0.0F, 0.46949356878647464F, 0.0F);
        this.body13 = new ModelRenderer(this, 8, 18);
        this.body13.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body13.addBox(-1.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body13, 0.0F, -0.46949356878647464F, 0.0F);
        this.body3 = new ModelRenderer(this, 8, 18);
        this.body3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body3.addBox(-1.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.4721115626644662F, 0.0F);
        this.body40 = new ModelRenderer(this, 30, 8);
        this.body40.mirror = true;
        this.body40.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body40.addBox(0.0F, -0.5F, -1.0F, 1, 9, 1, 0.0F);
        this.setRotateAngle(body40, 0.0F, 0.46949356878647464F, 0.0F);
        this.body42 = new ModelRenderer(this, 14, 6);
        this.body42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body42.addBox(-2.98F, 0.0F, -0.5F, 1, 9, 3, 0.0F);
        this.body35 = new ModelRenderer(this, 24, 2);
        this.body35.mirror = true;
        this.body35.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body35.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body35, 0.0F, 0.46949356878647464F, 0.0F);
        this.front9 = new ModelRenderer(this, 40, 18);
        this.front9.setRotationPoint(-1.5F, 0.5F, -3.76F);
        this.front9.addBox(-1.0F, -0.5F, 0.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(front9, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent33 = new ModelRenderer(this, 16, 3);
        this.indent33.mirror = true;
        this.indent33.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.indent33.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent33, 0.0F, -0.4721115626644662F, 0.0F);
        this.body14 = new ModelRenderer(this, 8, 18);
        this.body14.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body14.addBox(-1.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body14, 0.0F, -0.4721115626644662F, 0.0F);
        this.body27 = new ModelRenderer(this, 12, 18);
        this.body27.mirror = true;
        this.body27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body27.addBox(1.98F, 0.0F, -0.5F, 1, 10, 3, 0.0F);
        this.body51 = new ModelRenderer(this, 24, 2);
        this.body51.mirror = true;
        this.body51.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body51.addBox(0.0F, 7.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body51, 0.0F, 0.46949356878647464F, 0.0F);
        this.front3 = new ModelRenderer(this, 42, 6);
        this.front3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.front3.addBox(-1.0F, -0.5F, 0.0F, 1, 11, 1, 0.0F);
        this.setRotateAngle(front3, 0.0F, 0.4721115626644662F, 0.0F);
        this.body26 = new ModelRenderer(this, 20, 3);
        this.body26.setRotationPoint(-2.48F, 0.0F, -0.9F);
        this.body26.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body26, 0.9599310885968813F, 0.0F, 0.0F);
        this.body23 = new ModelRenderer(this, 19, 5);
        this.body23.setRotationPoint(-2.48F, 0.5F, -0.5F);
        this.body23.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.body11 = new ModelRenderer(this, 0, 0);
        this.body11.mirror = true;
        this.body11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body11.addBox(1.58F, 0.0F, -3.0F, 1, 12, 6, 0.0F);
        this.body36 = new ModelRenderer(this, 24, 2);
        this.body36.mirror = true;
        this.body36.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body36.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body36, 0.0F, 0.4721115626644662F, 0.0F);
        this.indent12 = new ModelRenderer(this, 16, 3);
        this.indent12.mirror = true;
        this.indent12.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.indent12.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent12, 0.0F, -0.4721115626644662F, 0.0F);
        this.front1 = new ModelRenderer(this, 34, 6);
        this.front1.setRotationPoint(0.0F, 11.7F, 0.0F);
        this.front1.addBox(-1.5F, 0.0F, -3.76F, 3, 11, 1, 0.0F);
        this.setRotateAngle(front1, 0.03490658503988659F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 8, 18);
        this.body4.mirror = true;
        this.body4.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body4.addBox(0.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent10 = new ModelRenderer(this, 16, 3);
        this.indent10.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.indent10.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent10, 0.0F, 0.4721115626644662F, 0.0F);
        this.body45 = new ModelRenderer(this, 14, 6);
        this.body45.mirror = true;
        this.body45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body45.addBox(1.98F, 0.0F, -0.5F, 1, 9, 3, 0.0F);
        this.indent3 = new ModelRenderer(this, 16, 3);
        this.indent3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.indent3.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent3, 0.0F, 0.4721115626644662F, 0.0F);
        this.front5 = new ModelRenderer(this, 42, 6);
        this.front5.mirror = true;
        this.front5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.front5.addBox(0.0F, -0.5F, 0.0F, 1, 11, 1, 0.0F);
        this.setRotateAngle(front5, 0.0F, -0.4721115626644662F, 0.0F);
        this.body43 = new ModelRenderer(this, 19, 5);
        this.body43.setRotationPoint(-2.48F, 8.5F, -0.5F);
        this.body43.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.body21 = new ModelRenderer(this, 28, 18);
        this.body21.mirror = true;
        this.body21.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body21.addBox(0.0F, -0.5F, -1.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(body21, 0.0F, 0.4721115626644662F, 0.0F);
        this.indent24 = new ModelRenderer(this, 16, 3);
        this.indent24.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.indent24.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent24, 0.0F, 0.4721115626644662F, 0.0F);
        this.front6 = new ModelRenderer(this, 46, 5);
        this.front6.mirror = true;
        this.front6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.front6.addBox(1.98F, 0.0F, -2.5F, 1, 11, 2, 0.0F);
        this.body10 = new ModelRenderer(this, 8, 18);
        this.body10.mirror = true;
        this.body10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body10.addBox(1.98F, 0.0F, -2.5F, 1, 12, 1, 0.0F);
        this.body22 = new ModelRenderer(this, 12, 18);
        this.body22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body22.addBox(-2.98F, 0.0F, -0.5F, 1, 10, 3, 0.0F);
        this.indent18 = new ModelRenderer(this, 16, 3);
        this.indent18.mirror = true;
        this.indent18.setRotationPoint(1.5F, -0.5F, -3.76F);
        this.indent18.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent18, 0.0F, -0.46949356878647464F, 0.0F);
        this.indent27 = new ModelRenderer(this, 8, 0);
        this.indent27.mirror = true;
        this.indent27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent27.addBox(1.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.indent28 = new ModelRenderer(this, 8, 0);
        this.indent28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent28.addBox(-2.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.indent31 = new ModelRenderer(this, 16, 3);
        this.indent31.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.indent31.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent31, 0.0F, 0.4721115626644662F, 0.0F);
        this.body41 = new ModelRenderer(this, 30, 8);
        this.body41.mirror = true;
        this.body41.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body41.addBox(0.0F, -0.5F, -1.0F, 1, 9, 1, 0.0F);
        this.setRotateAngle(body41, 0.0F, 0.4721115626644662F, 0.0F);
        this.indent7 = new ModelRenderer(this, 8, 0);
        this.indent7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent7.addBox(-2.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body28 = new ModelRenderer(this, 19, 5);
        this.body28.mirror = true;
        this.body28.setRotationPoint(2.48F, 0.5F, -0.5F);
        this.body28.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.indent5 = new ModelRenderer(this, 16, 3);
        this.indent5.mirror = true;
        this.indent5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.indent5.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent5, 0.0F, -0.4721115626644662F, 0.0F);
        this.body37 = new ModelRenderer(this, 22, 8);
        this.body37.setRotationPoint(0.0F, 9.8F, 0.0F);
        this.body37.addBox(-1.5F, 0.0F, 2.76F, 3, 9, 1, 0.0F);
        this.setRotateAngle(body37, 0.05235987755982988F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 0, 0);
        this.body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addBox(-2.58F, 0.0F, -3.0F, 1, 12, 6, 0.0F);
        this.indent13 = new ModelRenderer(this, 8, 0);
        this.indent13.mirror = true;
        this.indent13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent13.addBox(1.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body9 = new ModelRenderer(this, 8, 18);
        this.body9.mirror = true;
        this.body9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body9.addBox(1.98F, 0.0F, 1.5F, 1, 12, 1, 0.0F);
        this.body39 = new ModelRenderer(this, 30, 8);
        this.body39.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body39.addBox(-1.0F, -0.5F, -1.0F, 1, 9, 1, 0.0F);
        this.setRotateAngle(body39, 0.0F, -0.4721115626644662F, 0.0F);
        this.front2 = new ModelRenderer(this, 42, 6);
        this.front2.setRotationPoint(-1.5F, 0.5F, -3.76F);
        this.front2.addBox(-1.0F, -0.5F, 0.0F, 1, 11, 1, 0.0F);
        this.setRotateAngle(front2, 0.0F, 0.46949356878647464F, 0.0F);
        this.body32 = new ModelRenderer(this, 25, 0);
        this.body32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body32.addBox(-1.5F, 0.0F, 2.76F, 3, 1, 1, 0.0F);
        this.setRotateAngle(body32, 0.0F, 3.141592653589793F, 0.0F);
        this.indent35 = new ModelRenderer(this, 8, 0);
        this.indent35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent35.addBox(-2.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body44 = new ModelRenderer(this, 21, 0);
        this.body44.setRotationPoint(0.0F, -1.65F, 0.0F);
        this.body44.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(body44, -0.7853981633974483F, 0.0F, 0.0F);
        this.front14 = new ModelRenderer(this, 44, 18);
        this.front14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.front14.addBox(-2.98F, 0.0F, -2.5F, 1, 10, 2, 0.0F);
        this.indent17 = new ModelRenderer(this, 16, 3);
        this.indent17.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.indent17.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent17, 0.0F, 0.4721115626644662F, 0.0F);
        this.body46 = new ModelRenderer(this, 19, 5);
        this.body46.mirror = true;
        this.body46.setRotationPoint(2.48F, 8.5F, -0.5F);
        this.body46.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.front10 = new ModelRenderer(this, 40, 18);
        this.front10.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.front10.addBox(-1.0F, -0.5F, 0.0F, 1, 10, 1, 0.0F);
        this.setRotateAngle(front10, 0.0F, 0.4721115626644662F, 0.0F);
        this.indent22 = new ModelRenderer(this, 13, 0);
        this.indent22.setRotationPoint(0.0F, 12.9F, 0.23F);
        this.indent22.addBox(-1.5F, -1.0F, -3.76F, 3, 2, 1, 0.0F);
        this.setRotateAngle(indent22, 0.05235987755982988F, 0.0F, 0.0F);
        this.indent9 = new ModelRenderer(this, 16, 3);
        this.indent9.setRotationPoint(-1.5F, -0.5F, -3.76F);
        this.indent9.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent9, 0.0F, 0.46949356878647464F, 0.0F);
        this.indent34 = new ModelRenderer(this, 8, 0);
        this.indent34.mirror = true;
        this.indent34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent34.addBox(1.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.body34 = new ModelRenderer(this, 24, 2);
        this.body34.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body34.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body34, 0.0F, -0.4721115626644662F, 0.0F);
        this.indent19 = new ModelRenderer(this, 16, 3);
        this.indent19.mirror = true;
        this.indent19.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.indent19.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent19, 0.0F, -0.4721115626644662F, 0.0F);
        this.indent6 = new ModelRenderer(this, 8, 0);
        this.indent6.mirror = true;
        this.indent6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent6.addBox(1.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.indent26 = new ModelRenderer(this, 16, 3);
        this.indent26.mirror = true;
        this.indent26.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.indent26.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent26, 0.0F, -0.4721115626644662F, 0.0F);
        this.indent14 = new ModelRenderer(this, 8, 0);
        this.indent14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.indent14.addBox(-2.98F, -1.0F, -2.5F, 1, 2, 3, 0.0F);
        this.indent32 = new ModelRenderer(this, 16, 3);
        this.indent32.mirror = true;
        this.indent32.setRotationPoint(1.5F, -0.5F, -3.76F);
        this.indent32.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent32, 0.0F, -0.46949356878647464F, 0.0F);
        this.body5 = new ModelRenderer(this, 8, 18);
        this.body5.mirror = true;
        this.body5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body5.addBox(0.0F, -0.5F, -1.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.4721115626644662F, 0.0F);
        this.body30 = new ModelRenderer(this, 20, 3);
        this.body30.mirror = true;
        this.body30.setRotationPoint(2.48F, 0.0F, 0.9F);
        this.body30.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(body30, 0.6108652381980153F, 0.0F, 0.0F);
        this.indent25 = new ModelRenderer(this, 16, 3);
        this.indent25.mirror = true;
        this.indent25.setRotationPoint(1.5F, -0.5F, -3.76F);
        this.indent25.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(indent25, 0.0F, -0.46949356878647464F, 0.0F);
        this.body48 = new ModelRenderer(this, 25, 0);
        this.body48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body48.addBox(-1.5F, 8.0F, 2.76F, 3, 1, 1, 0.0F);
        this.setRotateAngle(body48, 0.0F, 3.141592653589793F, 0.0F);
        this.body1.addChild(this.body12);
        this.body48.addChild(this.body49);
        this.indent15.addChild(this.indent21);
        this.body22.addChild(this.body25);
        this.indent15.addChild(this.indent20);
        this.body15.addChild(this.body16);
        this.body6.addChild(this.body7);
        this.indent1.addChild(this.indent2);
        this.indent1.addChild(this.indent8);
        this.front8.addChild(this.front13);
        this.body1.addChild(this.body2);
        this.body32.addChild(this.body33);
        this.body1.addChild(this.body6);
        this.body46.addChild(this.body47);
        this.front8.addChild(this.front11);
        this.body1.addChild(this.body17);
        this.front1.addChild(this.front8);
        this.body12.addChild(this.body15);
        this.indent29.addChild(this.indent30);
        this.body27.addChild(this.body31);
        this.front1.addChild(this.front7);
        this.body49.addChild(this.body50);
        this.indent1.addChild(this.indent15);
        this.indent1.addChild(this.indent4);
        this.body23.addChild(this.body24);
        this.body28.addChild(this.body29);
        this.body51.addChild(this.body52);
        this.indent1.addChild(this.indent29);
        this.indent8.addChild(this.indent11);
        this.body37.addChild(this.body38);
        this.body18.addChild(this.body19);
        this.body17.addChild(this.body20);
        this.indent15.addChild(this.indent16);
        this.body17.addChild(this.body18);
        this.front1.addChild(this.front4);
        this.front11.addChild(this.front12);
        this.indent22.addChild(this.indent23);
        this.body12.addChild(this.body13);
        this.body2.addChild(this.body3);
        this.body37.addChild(this.body40);
        this.body37.addChild(this.body42);
        this.body32.addChild(this.body35);
        this.front8.addChild(this.front9);
        this.indent32.addChild(this.indent33);
        this.body13.addChild(this.body14);
        this.body17.addChild(this.body27);
        this.body48.addChild(this.body51);
        this.front2.addChild(this.front3);
        this.body22.addChild(this.body26);
        this.body22.addChild(this.body23);
        this.body9.addChild(this.body11);
        this.body35.addChild(this.body36);
        this.indent11.addChild(this.indent12);
        this.body1.addChild(this.body4);
        this.indent9.addChild(this.indent10);
        this.body37.addChild(this.body45);
        this.indent2.addChild(this.indent3);
        this.front4.addChild(this.front5);
        this.body42.addChild(this.body43);
        this.body20.addChild(this.body21);
        this.indent23.addChild(this.indent24);
        this.front1.addChild(this.front6);
        this.body9.addChild(this.body10);
        this.body17.addChild(this.body22);
        this.indent15.addChild(this.indent18);
        this.indent22.addChild(this.indent27);
        this.indent22.addChild(this.indent28);
        this.indent30.addChild(this.indent31);
        this.body40.addChild(this.body41);
        this.indent1.addChild(this.indent7);
        this.body27.addChild(this.body28);
        this.indent4.addChild(this.indent5);
        this.body17.addChild(this.body37);
        this.body6.addChild(this.body8);
        this.indent8.addChild(this.indent13);
        this.body1.addChild(this.body9);
        this.body38.addChild(this.body39);
        this.front1.addChild(this.front2);
        this.body17.addChild(this.body32);
        this.indent29.addChild(this.indent35);
        this.body43.addChild(this.body44);
        this.front8.addChild(this.front14);
        this.indent16.addChild(this.indent17);
        this.body45.addChild(this.body46);
        this.front9.addChild(this.front10);
        this.indent1.addChild(this.indent22);
        this.indent8.addChild(this.indent9);
        this.indent29.addChild(this.indent34);
        this.body33.addChild(this.body34);
        this.indent18.addChild(this.indent19);
        this.indent1.addChild(this.indent6);
        this.indent25.addChild(this.indent26);
        this.indent8.addChild(this.indent14);
        this.indent29.addChild(this.indent32);
        this.body4.addChild(this.body5);
        this.body27.addChild(this.body30);
        this.indent22.addChild(this.indent25);
        this.body37.addChild(this.body48);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.indent1.offsetX, this.indent1.offsetY, this.indent1.offsetZ);
        GL11.glTranslatef(this.indent1.rotationPointX * f5, this.indent1.rotationPointY * f5, this.indent1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.indent1.offsetX, -this.indent1.offsetY, -this.indent1.offsetZ);
        GL11.glTranslatef(-this.indent1.rotationPointX * f5, -this.indent1.rotationPointY * f5, -this.indent1.rotationPointZ * f5);
        this.indent1.render(f5);
        GL11.glPopMatrix();
        this.body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.front1.offsetX, this.front1.offsetY, this.front1.offsetZ);
        GL11.glTranslatef(this.front1.rotationPointX * f5, this.front1.rotationPointY * f5, this.front1.rotationPointZ * f5);
        GL11.glScaled(0.86D, 0.86D, 0.86D);
        GL11.glTranslatef(-this.front1.offsetX, -this.front1.offsetY, -this.front1.offsetZ);
        GL11.glTranslatef(-this.front1.rotationPointX * f5, -this.front1.rotationPointY * f5, -this.front1.rotationPointZ * f5);
        this.front1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

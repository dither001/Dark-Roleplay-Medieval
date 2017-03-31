package net.drpmedieval.client.entities.fox;

import org.lwjgl.opengl.GL11;

import net.drpmedieval.common.DarkRoleplayMedieval;
import net.drpmedieval.common.entities.fox.Entity_Fox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class Render_Fox extends RenderLiving<Entity_Fox>{

	public static final Factory FACTORY = new Factory();
	
	public Render_Fox(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new Model_Fox(), 0.5F);
	}

    @Override
    protected void preRenderCallback(Entity_Fox entity, float f){
    	GL11.glScalef(0.75F, 0.75F, 0.75F);
    }

    @Override
    public void doRender(Entity_Fox entity, double x, double y, double z, float entityYaw, float partialTicks){
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity_Fox entity) {
		return new ResourceLocation(DarkRoleplayMedieval.MODID, "textures/entitys/fox/fox.png");
	}
	
	private static class Factory implements IRenderFactory<Entity_Fox> {
		@Override
		public Render<? super Entity_Fox> createRenderFor(RenderManager manager) {
			return new Render_Fox(manager);
	    }
	}
}

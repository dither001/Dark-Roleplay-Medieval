package net.dark_roleplay.medieval.old.premium;

import net.dark_roleplay.medieval.References;
import net.dark_roleplay.medieval.client.objects.entities.model.Model_Fox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class RenderLayerPremium implements LayerRenderer<EntityPlayer> {

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}

	@Override
	public void doRenderLayer(EntityPlayer entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Model_Fox mf = new Model_Fox();
		Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(References.MODID, "textures/entitys/fox/fox.png"));
		mf.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

}

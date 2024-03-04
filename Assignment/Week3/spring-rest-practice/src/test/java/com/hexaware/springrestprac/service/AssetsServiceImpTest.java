package com.hexaware.springrestprac.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestprac.entity.Assets;

@SpringBootTest
class AssetsServiceImpTest {
	
	@Autowired
	IAssetsService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testGetAllAssets() {
		List list = service.getAllAssets();
		boolean flag = list.isEmpty();
		assertFalse(flag);
	}

	@Test
	void testAddAssets() {
		Assets asset = new Assets(11, "IN223345", "Gaming Chair", "Furniture", "Model G",
                Date.valueOf("2022-12-22"), Date.valueOf("2022-12-24"),
                new BigDecimal("5000"), "In Use");
		
		Assets a1 = service.addAssets(asset);
		assertEquals(11, a1.getAssetId());
	}

	@Test
	void testGetAssetById() {
		Assets assets = service.getAssetById(4);
		assertEquals("Sofa", assets.getAssetName());
	}

	@Test
	void testDeleteAssetById() {
		Assets a1 = new Assets();
		int assetId = 11;
		String count = service.deleteAssetById(assetId);
		
		assertEquals(11, a1.getAssetId());
		
		
	}

}

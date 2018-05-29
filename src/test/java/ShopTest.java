import com.kingguanzhang.enums.ShopSateEnum;
import com.kingguanzhang.pojo.Area;
import com.kingguanzhang.pojo.PersonInfo;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.pojo.ShopCategory;
import com.kingguanzhang.service.ShopService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;

public class ShopTest extends BaseTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop() {
        /*Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1);
        shop.setOwnerId(1);
        shop.setAreaId(1);
        shop.setShopCategoryId(1);
        shop.setShopName("店铺11号");
        shop.setShopAddr("上海");
        shop.setPhone(111111L);
        shop.setPriority(1);
        shop.setCreateTime(new Date());
        shop.setEditTime(new Date());
        shop.setEnableStatus(ShopSateEnum.CHECK.getState());
        shop.setAdvice("管理员正忙,没空理你");
        shop.setShopDesc("爱买不买,又不是不能用");

        File file = new File("D:/test3.jpg");
*/
        //shopService.addShop(shop,file);
        System.out.print("success");
    }
}

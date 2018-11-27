package chenji.cn.com.baiducontrol;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.location.Location;
import android.view.inputmethod.InputConnectionWrapper;

import chenji.cn.com.baiducontrol.interf.BaiduInterf;
import chenji.cn.com.baiducontrol.interf.LocationInterf;
import chenji.cn.com.baiducontrol.location.LocationService;

/**
 *author by chenji on 2018/11/25
 */
public class BaiduManager implements BaiduInterf {
    public  static  BaiduManager mBaiduManager;

    public static BaiduManager  getInstance(){    //获取单例对象
        if(mBaiduManager==null){
            mBaiduManager=new BaiduManager();
        }
        return  mBaiduManager;
    }


    @Override
    public String getLocation(Context context,LocationInterf locationInterf) {
        LocationService locationService= new LocationService(context,locationInterf);
        locationService.startLocate();
        return null;
    }
}

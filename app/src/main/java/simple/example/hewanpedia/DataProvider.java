package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Merpati;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Sapi;
import simple.example.hewanpedia.model.Turtle;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Sapi> initDataSapi(Context ctx) {
        List<Sapi> sapis = new ArrayList<>();
        sapis.add(new Sapi(ctx.getString(R.string.angus_nama), ctx.getString(R.string.angus_asal),
                ctx.getString(R.string.angus_deskripsi), R.drawable.sapi_angus));
        sapis.add(new Sapi(ctx.getString(R.string.holstein_nama), ctx.getString(R.string.holstein_asal),
                ctx.getString(R.string.holstein_deskripsi),R.drawable.sapi_holstein));
        sapis.add(new Sapi(ctx.getString(R.string.hereford_nama), ctx.getString(R.string.hereford_asal),
                ctx.getString(R.string.hereford_deskripsi),R.drawable.sapi_hereford));
        sapis.add(new Sapi(ctx.getString(R.string.simmental_nama), ctx.getString(R.string.simmental_asal),
                ctx.getString(R.string.simmental_deskripsi),R.drawable.sapi_simmental));
        sapis.add(new Sapi(ctx.getString(R.string.limousin_nama), ctx.getString(R.string.limousin_asal),
                ctx.getString(R.string.limousin_deskripsi),R.drawable.sapi_limousin));
        sapis.add(new Sapi(ctx.getString(R.string.galloway_nama), ctx.getString(R.string.galloway_asal),
                ctx.getString(R.string.galloway_deskripsi),R.drawable.sapi_galloway));
        return sapis;
    }

    private static List<Merpati> initDataMerpati(Context ctx) {
        List<Merpati> merpatis = new ArrayList<>();
        merpatis.add(new Merpati(ctx.getString(R.string.modena_nama), ctx.getString(R.string.modena_asal),
                ctx.getString(R.string.modena_deskripsi), R.drawable.merpati_modena));
        merpatis.add(new Merpati(ctx.getString(R.string.jacobin_nama), ctx.getString(R.string.jacobin_asal),
                ctx.getString(R.string.jacobin_deskripsi), R.drawable.merpati_jacobin));
        merpatis.add(new Merpati(ctx.getString(R.string.brongsong_nama), ctx.getString(R.string.brongsong_asal),
                ctx.getString(R.string.brongsong_deskripsi), R.drawable.merpati_brongsong));
        merpatis.add(new Merpati(ctx.getString(R.string.wulung_nama), ctx.getString(R.string.wulung_asal),
                ctx.getString(R.string.wulung_deskripsi), R.drawable.merpati_wulung));
        merpatis.add(new Merpati(ctx.getString(R.string.satinetteorientalfrill_nama), ctx.getString(R.string.satinetteorientalfrill_asal),
                ctx.getString(R.string.satinetteorientalfrill_deskripsi), R.drawable.merpati_satinette));
        return merpatis;
    }

    private static List<Turtle> initDataTutle(Context ctx) {
        List<Turtle> turtles = new ArrayList<>();
        turtles.add(new Turtle(ctx.getString(R.string.redearslider_nama), ctx.getString(R.string.redearslider_asal),
                ctx.getString(R.string.redearslider_deskripsi), R.drawable.turtle_redearslider));
        turtles.add(new Turtle(ctx.getString(R.string.leopard_nama), ctx.getString(R.string.leopard_asal),
                ctx.getString(R.string.leopard_deskripsi), R.drawable.turtle_leopard));
        turtles.add(new Turtle(ctx.getString(R.string.spurred_nama), ctx.getString(R.string.spurred_asal),
                ctx.getString(R.string.spurred_deskripsi), R.drawable.turtle_spurred));
        turtles.add(new Turtle(ctx.getString(R.string.radiated_nama), ctx.getString(R.string.radiated_asal),
                ctx.getString(R.string.radiated_deskripsi), R.drawable.turtle_radiated));
        turtles.add(new Turtle(ctx.getString(R.string.sulcata_nama), ctx.getString(R.string.sulcata_asal),
                ctx.getString(R.string.sulcata_deskripsi), R.drawable.turtle_sulcata));
        turtles.add(new Turtle(ctx.getString(R.string.aldabra_nama), ctx.getString(R.string.aldabra_asal),
                ctx.getString(R.string.aldabra_deskripsi), R.drawable.turtle_aldabra));
        return turtles;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSapi(ctx));
        hewans.addAll(initDataMerpati(ctx));
        hewans.addAll(initDataTutle(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

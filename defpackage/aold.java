package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aold {
    public static final Map a;

    static {
        amrp f;
        amrp amrpVar;
        amrp f2;
        amrp amrpVar2;
        amrp f3;
        amrp amrpVar3;
        amrp f4;
        amrp f5;
        amrp amrpVar4;
        amrp amrpVar5;
        amrp amrpVar6;
        amrp f6;
        amrp amrpVar7;
        amrp f7;
        amrp amrpVar8;
        amrp amrpVar9;
        amrp amrpVar10;
        amrp amrpVar11;
        amrp amrpVar12;
        amrp amrpVar13;
        amrp amrpVar14;
        amrp amrpVar15;
        amrp f8;
        amrp amrpVar16;
        amrp f9;
        amrp f10;
        amrp f11;
        amrp f12;
        amrp amrpVar17;
        amrp amrpVar18;
        amrp f13;
        amrp f14;
        amrp f15;
        amrp f16;
        amrp f17;
        amrp f18;
        amrp f19;
        amrp f20;
        amrp f21;
        amrp f22;
        amrp f23;
        amrp f24;
        amrp f25;
        amrp amrpVar19;
        amrp f26;
        amrp f27;
        amrp f28;
        amrp f29;
        amrp f30;
        amrp f31;
        amrp f32;
        amrp f33;
        amrp f34;
        amrp f35;
        amrp f36;
        amrp f37;
        amrp f38;
        amrp f39;
        amrp f40;
        amrp f41;
        amrp f42;
        amrp f43;
        amrp f44;
        amrp f45;
        amrp f46;
        amrp f47;
        amrp f48;
        amrp f49;
        amrp f50;
        amrp f51;
        amrp f52;
        amrp f53;
        amrp f54;
        amrp f55;
        amrp f56;
        amrp f57;
        amrp f58;
        amrp f59;
        amrp f60;
        amrp f61;
        amrp f62;
        amrp f63;
        amrp f64;
        amrp f65;
        amrp f66;
        amrp f67;
        amrp f68;
        amrp f69;
        amrp f70;
        amrp f71;
        amrp f72;
        amrp f73;
        amrp f74;
        amrp f75;
        amrp f76;
        TreeMap treeMap = new TreeMap();
        if (treeMap.containsKey("s")) {
            f = (amrp) treeMap.get("s");
        } else {
            f = amru.f();
            treeMap.put("s", f);
        }
        f.h(aolc.a(aolf.SIZE, aole.INTEGER));
        if (treeMap.containsKey("w")) {
            amrpVar = (amrp) treeMap.get("w");
        } else {
            amrp f77 = amru.f();
            treeMap.put("w", f77);
            amrpVar = f77;
        }
        amrpVar.h(aolc.a(aolf.WIDTH, aole.INTEGER));
        if (treeMap.containsKey("c")) {
            f2 = (amrp) treeMap.get("c");
        } else {
            f2 = amru.f();
            treeMap.put("c", f2);
        }
        f2.h(aolc.a(aolf.CROP, aole.BOOLEAN));
        if (treeMap.containsKey("d")) {
            amrpVar2 = (amrp) treeMap.get("d");
        } else {
            amrp f78 = amru.f();
            treeMap.put("d", f78);
            amrpVar2 = f78;
        }
        amrpVar2.h(aolc.a(aolf.DOWNLOAD, aole.BOOLEAN));
        if (treeMap.containsKey("h")) {
            f3 = (amrp) treeMap.get("h");
        } else {
            f3 = amru.f();
            treeMap.put("h", f3);
        }
        f3.h(aolc.a(aolf.HEIGHT, aole.INTEGER));
        if (treeMap.containsKey("s")) {
            amrpVar3 = (amrp) treeMap.get("s");
        } else {
            amrp f79 = amru.f();
            treeMap.put("s", f79);
            amrpVar3 = f79;
        }
        amrpVar3.h(aolc.a(aolf.STRETCH, aole.BOOLEAN));
        if (treeMap.containsKey("h")) {
            f4 = (amrp) treeMap.get("h");
        } else {
            f4 = amru.f();
            treeMap.put("h", f4);
        }
        f4.h(aolc.a(aolf.HTML, aole.BOOLEAN));
        if (treeMap.containsKey("p")) {
            f5 = (amrp) treeMap.get("p");
        } else {
            f5 = amru.f();
            treeMap.put("p", f5);
        }
        f5.h(aolc.a(aolf.SMART_CROP, aole.BOOLEAN));
        if (treeMap.containsKey("pp")) {
            amrpVar4 = (amrp) treeMap.get("pp");
        } else {
            amrp f80 = amru.f();
            treeMap.put("pp", f80);
            amrpVar4 = f80;
        }
        amrpVar4.h(aolc.a(aolf.SMART_CROP_NO_CLIP, aole.BOOLEAN));
        if (treeMap.containsKey("pf")) {
            amrpVar5 = (amrp) treeMap.get("pf");
        } else {
            amrp f81 = amru.f();
            treeMap.put("pf", f81);
            amrpVar5 = f81;
        }
        amrpVar5.h(aolc.a(aolf.SMART_CROP_USE_FACE, aole.BOOLEAN));
        if (treeMap.containsKey("n")) {
            amrpVar6 = (amrp) treeMap.get("n");
        } else {
            amrp f82 = amru.f();
            treeMap.put("n", f82);
            amrpVar6 = f82;
        }
        amrpVar6.h(aolc.a(aolf.CENTER_CROP, aole.BOOLEAN));
        if (treeMap.containsKey("r")) {
            f6 = (amrp) treeMap.get("r");
        } else {
            f6 = amru.f();
            treeMap.put("r", f6);
        }
        f6.h(aolc.a(aolf.ROTATE, aole.INTEGER));
        if (treeMap.containsKey("r")) {
            amrpVar7 = (amrp) treeMap.get("r");
        } else {
            amrp f83 = amru.f();
            treeMap.put("r", f83);
            amrpVar7 = f83;
        }
        amrpVar7.h(aolc.a(aolf.SKIP_REFERER_CHECK, aole.BOOLEAN));
        if (treeMap.containsKey("o")) {
            f7 = (amrp) treeMap.get("o");
        } else {
            f7 = amru.f();
            treeMap.put("o", f7);
        }
        f7.h(aolc.a(aolf.OVERLAY, aole.BOOLEAN));
        if (treeMap.containsKey("o")) {
            amrpVar8 = (amrp) treeMap.get("o");
        } else {
            amrp f84 = amru.f();
            treeMap.put("o", f84);
            amrpVar8 = f84;
        }
        amrpVar8.h(aolc.a(aolf.OBJECT_ID, aole.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("j")) {
            amrpVar9 = (amrp) treeMap.get("j");
        } else {
            amrp f85 = amru.f();
            treeMap.put("j", f85);
            amrpVar9 = f85;
        }
        amrpVar9.h(aolc.a(aolf.FRAME_ID, aole.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("x")) {
            amrpVar10 = (amrp) treeMap.get("x");
        } else {
            amrp f86 = amru.f();
            treeMap.put("x", f86);
            amrpVar10 = f86;
        }
        amrpVar10.h(aolc.a(aolf.TILE_X, aole.INTEGER));
        if (treeMap.containsKey("y")) {
            amrpVar11 = (amrp) treeMap.get("y");
        } else {
            amrp f87 = amru.f();
            treeMap.put("y", f87);
            amrpVar11 = f87;
        }
        amrpVar11.h(aolc.a(aolf.TILE_Y, aole.INTEGER));
        if (treeMap.containsKey("z")) {
            amrpVar12 = (amrp) treeMap.get("z");
        } else {
            amrp f88 = amru.f();
            treeMap.put("z", f88);
            amrpVar12 = f88;
        }
        amrpVar12.h(aolc.a(aolf.TILE_ZOOM, aole.INTEGER));
        if (treeMap.containsKey("g")) {
            amrpVar13 = (amrp) treeMap.get("g");
        } else {
            amrp f89 = amru.f();
            treeMap.put("g", f89);
            amrpVar13 = f89;
        }
        amrpVar13.h(aolc.a(aolf.TILE_GENERATION, aole.BOOLEAN));
        if (treeMap.containsKey("e")) {
            amrpVar14 = (amrp) treeMap.get("e");
        } else {
            amrp f90 = amru.f();
            treeMap.put("e", f90);
            amrpVar14 = f90;
        }
        amrpVar14.h(aolc.a(aolf.EXPIRATION_TIME, aole.INTEGER));
        if (treeMap.containsKey("f")) {
            amrpVar15 = (amrp) treeMap.get("f");
        } else {
            amrp f91 = amru.f();
            treeMap.put("f", f91);
            amrpVar15 = f91;
        }
        amrpVar15.h(aolc.a(aolf.IMAGE_FILTER, aole.STRING));
        if (treeMap.containsKey("k")) {
            f8 = (amrp) treeMap.get("k");
        } else {
            f8 = amru.f();
            treeMap.put("k", f8);
        }
        f8.h(aolc.a(aolf.KILL_ANIMATION, aole.BOOLEAN));
        if (treeMap.containsKey("u")) {
            amrpVar16 = (amrp) treeMap.get("u");
        } else {
            amrp f92 = amru.f();
            treeMap.put("u", f92);
            amrpVar16 = f92;
        }
        amrpVar16.h(aolc.a(aolf.UNFILTERED, aole.BOOLEAN));
        if (treeMap.containsKey("ut")) {
            f9 = (amrp) treeMap.get("ut");
        } else {
            f9 = amru.f();
            treeMap.put("ut", f9);
        }
        f9.h(aolc.a(aolf.UNFILTERED_WITH_TRANSFORMS, aole.BOOLEAN));
        if (treeMap.containsKey("i")) {
            f10 = (amrp) treeMap.get("i");
        } else {
            f10 = amru.f();
            treeMap.put("i", f10);
        }
        f10.h(aolc.a(aolf.INCLUDE_METADATA, aole.BOOLEAN));
        if (treeMap.containsKey("a")) {
            f11 = (amrp) treeMap.get("a");
        } else {
            f11 = amru.f();
            treeMap.put("a", f11);
        }
        f11.h(aolc.a(aolf.ES_PORTRAIT_APPROVED_ONLY, aole.BOOLEAN));
        if (treeMap.containsKey("b")) {
            f12 = (amrp) treeMap.get("b");
        } else {
            f12 = amru.f();
            treeMap.put("b", f12);
        }
        f12.h(aolc.a(aolf.BYPASS_TAKEDOWN, aole.BOOLEAN));
        if (treeMap.containsKey("b")) {
            amrpVar17 = (amrp) treeMap.get("b");
        } else {
            amrp f93 = amru.f();
            treeMap.put("b", f93);
            amrpVar17 = f93;
        }
        amrpVar17.h(aolc.a(aolf.BORDER_SIZE, aole.INTEGER));
        if (treeMap.containsKey("c")) {
            amrpVar18 = (amrp) treeMap.get("c");
        } else {
            amrp f94 = amru.f();
            treeMap.put("c", f94);
            amrpVar18 = f94;
        }
        amrpVar18.h(aolc.a(aolf.BORDER_COLOR, aole.PREFIX_HEX));
        if (treeMap.containsKey("q")) {
            f13 = (amrp) treeMap.get("q");
        } else {
            f13 = amru.f();
            treeMap.put("q", f13);
        }
        f13.h(aolc.a(aolf.QUERY_STRING, aole.STRING));
        if (treeMap.containsKey("fh")) {
            f14 = (amrp) treeMap.get("fh");
        } else {
            f14 = amru.f();
            treeMap.put("fh", f14);
        }
        f14.h(aolc.a(aolf.HORIZONTAL_FLIP, aole.BOOLEAN));
        if (treeMap.containsKey("fv")) {
            f15 = (amrp) treeMap.get("fv");
        } else {
            f15 = amru.f();
            treeMap.put("fv", f15);
        }
        f15.h(aolc.a(aolf.VERTICAL_FLIP, aole.BOOLEAN));
        if (treeMap.containsKey("fg")) {
            f16 = (amrp) treeMap.get("fg");
        } else {
            f16 = amru.f();
            treeMap.put("fg", f16);
        }
        f16.h(aolc.a(aolf.FORCE_TILE_GENERATION, aole.BOOLEAN));
        if (treeMap.containsKey("ci")) {
            f17 = (amrp) treeMap.get("ci");
        } else {
            f17 = amru.f();
            treeMap.put("ci", f17);
        }
        f17.h(aolc.a(aolf.IMAGE_CROP, aole.BOOLEAN));
        if (treeMap.containsKey("rw")) {
            f18 = (amrp) treeMap.get("rw");
        } else {
            f18 = amru.f();
            treeMap.put("rw", f18);
        }
        f18.h(aolc.a(aolf.REQUEST_WEBP, aole.BOOLEAN));
        if (treeMap.containsKey("rwu")) {
            f19 = (amrp) treeMap.get("rwu");
        } else {
            f19 = amru.f();
            treeMap.put("rwu", f19);
        }
        f19.h(aolc.a(aolf.REQUEST_WEBP_UNLESS_MAYBE_TRANSPARENT, aole.BOOLEAN));
        if (treeMap.containsKey("rwa")) {
            f20 = (amrp) treeMap.get("rwa");
        } else {
            f20 = amru.f();
            treeMap.put("rwa", f20);
        }
        f20.h(aolc.a(aolf.REQUEST_ANIMATED_WEBP, aole.BOOLEAN));
        if (treeMap.containsKey("nw")) {
            f21 = (amrp) treeMap.get("nw");
        } else {
            f21 = amru.f();
            treeMap.put("nw", f21);
        }
        f21.h(aolc.a(aolf.NO_WEBP, aole.BOOLEAN));
        if (treeMap.containsKey("rh")) {
            f22 = (amrp) treeMap.get("rh");
        } else {
            f22 = amru.f();
            treeMap.put("rh", f22);
        }
        f22.h(aolc.a(aolf.REQUEST_H264, aole.BOOLEAN));
        if (treeMap.containsKey("no")) {
            f23 = (amrp) treeMap.get("no");
        } else {
            f23 = amru.f();
            treeMap.put("no", f23);
        }
        f23.h(aolc.a(aolf.NO_OVERLAY, aole.BOOLEAN));
        if (treeMap.containsKey("ns")) {
            f24 = (amrp) treeMap.get("ns");
        } else {
            f24 = amru.f();
            treeMap.put("ns", f24);
        }
        f24.h(aolc.a(aolf.NO_SILHOUETTE, aole.BOOLEAN));
        if (treeMap.containsKey("k")) {
            f25 = (amrp) treeMap.get("k");
        } else {
            f25 = amru.f();
            treeMap.put("k", f25);
        }
        f25.h(aolc.a(aolf.FOCUS_BLUR, aole.INTEGER));
        if (treeMap.containsKey("p")) {
            amrpVar19 = (amrp) treeMap.get("p");
        } else {
            amrp f95 = amru.f();
            treeMap.put("p", f95);
            amrpVar19 = f95;
        }
        amrpVar19.h(aolc.a(aolf.FOCAL_PLANE, aole.INTEGER));
        if (treeMap.containsKey("l")) {
            f26 = (amrp) treeMap.get("l");
        } else {
            f26 = amru.f();
            treeMap.put("l", f26);
        }
        f26.h(aolc.a(aolf.QUALITY_LEVEL, aole.INTEGER));
        if (treeMap.containsKey("v")) {
            f27 = (amrp) treeMap.get("v");
        } else {
            f27 = amru.f();
            treeMap.put("v", f27);
        }
        f27.h(aolc.a(aolf.QUALITY_BUCKET, aole.INTEGER));
        if (treeMap.containsKey("nu")) {
            f28 = (amrp) treeMap.get("nu");
        } else {
            f28 = amru.f();
            treeMap.put("nu", f28);
        }
        f28.h(aolc.a(aolf.NO_UPSCALE, aole.BOOLEAN));
        if (treeMap.containsKey("ft")) {
            f29 = (amrp) treeMap.get("ft");
        } else {
            f29 = amru.f();
            treeMap.put("ft", f29);
        }
        f29.h(aolc.a(aolf.FORCE_TRANSFORMATION, aole.BOOLEAN));
        if (treeMap.containsKey("cc")) {
            f30 = (amrp) treeMap.get("cc");
        } else {
            f30 = amru.f();
            treeMap.put("cc", f30);
        }
        f30.h(aolc.a(aolf.CIRCLE_CROP, aole.BOOLEAN));
        if (treeMap.containsKey("nd")) {
            f31 = (amrp) treeMap.get("nd");
        } else {
            f31 = amru.f();
            treeMap.put("nd", f31);
        }
        f31.h(aolc.a(aolf.NO_DEFAULT_IMAGE, aole.BOOLEAN));
        if (treeMap.containsKey("ip")) {
            f32 = (amrp) treeMap.get("ip");
        } else {
            f32 = amru.f();
            treeMap.put("ip", f32);
        }
        f32.h(aolc.a(aolf.INCLUDE_PUBLIC_METADATA, aole.BOOLEAN));
        if (treeMap.containsKey("nc")) {
            f33 = (amrp) treeMap.get("nc");
        } else {
            f33 = amru.f();
            treeMap.put("nc", f33);
        }
        f33.h(aolc.a(aolf.NO_CORRECT_EXIF_ORIENTATION, aole.BOOLEAN));
        if (treeMap.containsKey("a")) {
            f34 = (amrp) treeMap.get("a");
        } else {
            f34 = amru.f();
            treeMap.put("a", f34);
        }
        f34.h(aolc.a(aolf.SELECT_FRAME_NUMBER, aole.INTEGER));
        if (treeMap.containsKey("rj")) {
            f35 = (amrp) treeMap.get("rj");
        } else {
            f35 = amru.f();
            treeMap.put("rj", f35);
        }
        f35.h(aolc.a(aolf.REQUEST_JPEG, aole.BOOLEAN));
        if (treeMap.containsKey("rp")) {
            f36 = (amrp) treeMap.get("rp");
        } else {
            f36 = amru.f();
            treeMap.put("rp", f36);
        }
        f36.h(aolc.a(aolf.REQUEST_PNG, aole.BOOLEAN));
        if (treeMap.containsKey("rg")) {
            f37 = (amrp) treeMap.get("rg");
        } else {
            f37 = amru.f();
            treeMap.put("rg", f37);
        }
        f37.h(aolc.a(aolf.REQUEST_GIF, aole.BOOLEAN));
        if (treeMap.containsKey("pd")) {
            f38 = (amrp) treeMap.get("pd");
        } else {
            f38 = amru.f();
            treeMap.put("pd", f38);
        }
        f38.h(aolc.a(aolf.PAD, aole.BOOLEAN));
        if (treeMap.containsKey("pa")) {
            f39 = (amrp) treeMap.get("pa");
        } else {
            f39 = amru.f();
            treeMap.put("pa", f39);
        }
        f39.h(aolc.a(aolf.PRESERVE_ASPECT_RATIO, aole.BOOLEAN));
        if (treeMap.containsKey("m")) {
            f40 = (amrp) treeMap.get("m");
        } else {
            f40 = amru.f();
            treeMap.put("m", f40);
        }
        f40.h(aolc.a(aolf.VIDEO_FORMAT, aole.INTEGER));
        if (treeMap.containsKey("vb")) {
            f41 = (amrp) treeMap.get("vb");
        } else {
            f41 = amru.f();
            treeMap.put("vb", f41);
        }
        f41.h(aolc.a(aolf.VIDEO_BEGIN, aole.LONG));
        if (treeMap.containsKey("vl")) {
            f42 = (amrp) treeMap.get("vl");
        } else {
            f42 = amru.f();
            treeMap.put("vl", f42);
        }
        f42.h(aolc.a(aolf.VIDEO_LENGTH, aole.LONG));
        if (treeMap.containsKey("lf")) {
            f43 = (amrp) treeMap.get("lf");
        } else {
            f43 = amru.f();
            treeMap.put("lf", f43);
        }
        f43.h(aolc.a(aolf.LOOSE_FACE_CROP, aole.BOOLEAN));
        if (treeMap.containsKey("mv")) {
            f44 = (amrp) treeMap.get("mv");
        } else {
            f44 = amru.f();
            treeMap.put("mv", f44);
        }
        f44.h(aolc.a(aolf.MATCH_VERSION, aole.BOOLEAN));
        if (treeMap.containsKey("id")) {
            f45 = (amrp) treeMap.get("id");
        } else {
            f45 = amru.f();
            treeMap.put("id", f45);
        }
        f45.h(aolc.a(aolf.IMAGE_DIGEST, aole.BOOLEAN));
        if (treeMap.containsKey("al")) {
            f46 = (amrp) treeMap.get("al");
        } else {
            f46 = amru.f();
            treeMap.put("al", f46);
        }
        f46.h(aolc.a(aolf.AUTOLOOP, aole.BOOLEAN));
        if (treeMap.containsKey("ic")) {
            f47 = (amrp) treeMap.get("ic");
        } else {
            f47 = amru.f();
            treeMap.put("ic", f47);
        }
        f47.h(aolc.a(aolf.INTERNAL_CLIENT, aole.INTEGER));
        if (treeMap.containsKey("pg")) {
            f48 = (amrp) treeMap.get("pg");
        } else {
            f48 = amru.f();
            treeMap.put("pg", f48);
        }
        f48.h(aolc.a(aolf.TILE_PYRAMID_AS_PROTO, aole.BOOLEAN));
        if (treeMap.containsKey("mo")) {
            f49 = (amrp) treeMap.get("mo");
        } else {
            f49 = amru.f();
            treeMap.put("mo", f49);
        }
        f49.h(aolc.a(aolf.MONOGRAM, aole.BOOLEAN));
        if (treeMap.containsKey("nt0")) {
            f50 = (amrp) treeMap.get("nt0");
        } else {
            f50 = amru.f();
            treeMap.put("nt0", f50);
        }
        f50.h(aolc.a(aolf.VERSIONED_TOKEN, aole.STRING));
        if (treeMap.containsKey("iv")) {
            f51 = (amrp) treeMap.get("iv");
        } else {
            f51 = amru.f();
            treeMap.put("iv", f51);
        }
        f51.h(aolc.a(aolf.IMAGE_VERSION, aole.LONG));
        if (treeMap.containsKey("pi")) {
            f52 = (amrp) treeMap.get("pi");
        } else {
            f52 = amru.f();
            treeMap.put("pi", f52);
        }
        f52.h(aolc.a(aolf.PITCH_DEGREES, aole.FLOAT));
        if (treeMap.containsKey("ya")) {
            f53 = (amrp) treeMap.get("ya");
        } else {
            f53 = amru.f();
            treeMap.put("ya", f53);
        }
        f53.h(aolc.a(aolf.YAW_DEGREES, aole.FLOAT));
        if (treeMap.containsKey("ro")) {
            f54 = (amrp) treeMap.get("ro");
        } else {
            f54 = amru.f();
            treeMap.put("ro", f54);
        }
        f54.h(aolc.a(aolf.ROLL_DEGREES, aole.FLOAT));
        if (treeMap.containsKey("fo")) {
            f55 = (amrp) treeMap.get("fo");
        } else {
            f55 = amru.f();
            treeMap.put("fo", f55);
        }
        f55.h(aolc.a(aolf.FOV_DEGREES, aole.FLOAT));
        if (treeMap.containsKey("df")) {
            f56 = (amrp) treeMap.get("df");
        } else {
            f56 = amru.f();
            treeMap.put("df", f56);
        }
        f56.h(aolc.a(aolf.DETECT_FACES, aole.BOOLEAN));
        if (treeMap.containsKey("mm")) {
            f57 = (amrp) treeMap.get("mm");
        } else {
            f57 = amru.f();
            treeMap.put("mm", f57);
        }
        f57.h(aolc.a(aolf.VIDEO_MULTI_FORMAT, aole.STRING));
        if (treeMap.containsKey("sg")) {
            f58 = (amrp) treeMap.get("sg");
        } else {
            f58 = amru.f();
            treeMap.put("sg", f58);
        }
        f58.h(aolc.a(aolf.STRIP_GOOGLE_DATA, aole.BOOLEAN));
        if (treeMap.containsKey("gd")) {
            f59 = (amrp) treeMap.get("gd");
        } else {
            f59 = amru.f();
            treeMap.put("gd", f59);
        }
        f59.h(aolc.a(aolf.PRESERVE_GOOGLE_DATA, aole.BOOLEAN));
        if (treeMap.containsKey("fm")) {
            f60 = (amrp) treeMap.get("fm");
        } else {
            f60 = amru.f();
            treeMap.put("fm", f60);
        }
        f60.h(aolc.a(aolf.FORCE_MONOGRAM, aole.BOOLEAN));
        if (treeMap.containsKey("ba")) {
            f61 = (amrp) treeMap.get("ba");
        } else {
            f61 = amru.f();
            treeMap.put("ba", f61);
        }
        f61.h(aolc.a(aolf.BADGE, aole.INTEGER));
        if (treeMap.containsKey("br")) {
            f62 = (amrp) treeMap.get("br");
        } else {
            f62 = amru.f();
            treeMap.put("br", f62);
        }
        f62.h(aolc.a(aolf.BORDER_RADIUS, aole.INTEGER));
        if (treeMap.containsKey("bc")) {
            f63 = (amrp) treeMap.get("bc");
        } else {
            f63 = amru.f();
            treeMap.put("bc", f63);
        }
        f63.h(aolc.a(aolf.BACKGROUND_COLOR, aole.PREFIX_HEX));
        if (treeMap.containsKey("pc")) {
            f64 = (amrp) treeMap.get("pc");
        } else {
            f64 = amru.f();
            treeMap.put("pc", f64);
        }
        f64.h(aolc.a(aolf.PAD_COLOR, aole.PREFIX_HEX));
        if (treeMap.containsKey("sc")) {
            f65 = (amrp) treeMap.get("sc");
        } else {
            f65 = amru.f();
            treeMap.put("sc", f65);
        }
        f65.h(aolc.a(aolf.SUBSTITUTION_COLOR, aole.PREFIX_HEX));
        if (treeMap.containsKey("dv")) {
            f66 = (amrp) treeMap.get("dv");
        } else {
            f66 = amru.f();
            treeMap.put("dv", f66);
        }
        f66.h(aolc.a(aolf.DOWNLOAD_VIDEO, aole.BOOLEAN));
        if (treeMap.containsKey("md")) {
            f67 = (amrp) treeMap.get("md");
        } else {
            f67 = amru.f();
            treeMap.put("md", f67);
        }
        f67.h(aolc.a(aolf.MONOGRAM_DOGFOOD, aole.BOOLEAN));
        if (treeMap.containsKey("cp")) {
            f68 = (amrp) treeMap.get("cp");
        } else {
            f68 = amru.f();
            treeMap.put("cp", f68);
        }
        f68.h(aolc.a(aolf.COLOR_PROFILE, aole.INTEGER));
        if (treeMap.containsKey("sm")) {
            f69 = (amrp) treeMap.get("sm");
        } else {
            f69 = amru.f();
            treeMap.put("sm", f69);
        }
        f69.h(aolc.a(aolf.STRIP_METADATA, aole.BOOLEAN));
        if (treeMap.containsKey("cv")) {
            f70 = (amrp) treeMap.get("cv");
        } else {
            f70 = amru.f();
            treeMap.put("cv", f70);
        }
        f70.h(aolc.a(aolf.FACE_CROP_VERSION, aole.INTEGER));
        if (treeMap.containsKey("ng")) {
            f71 = (amrp) treeMap.get("ng");
        } else {
            f71 = amru.f();
            treeMap.put("ng", f71);
        }
        f71.h(aolc.a(aolf.STRIP_GEOINFO, aole.BOOLEAN));
        if (treeMap.containsKey("il")) {
            f72 = (amrp) treeMap.get("il");
        } else {
            f72 = amru.f();
            treeMap.put("il", f72);
        }
        f72.h(aolc.a(aolf.IGNORE_LOW_RES_PROFILE_PHOTO, aole.BOOLEAN));
        if (treeMap.containsKey("lo")) {
            f73 = (amrp) treeMap.get("lo");
        } else {
            f73 = amru.f();
            treeMap.put("lo", f73);
        }
        f73.h(aolc.a(aolf.LOSSY, aole.BOOLEAN));
        if (treeMap.containsKey("vm")) {
            f74 = (amrp) treeMap.get("vm");
        } else {
            f74 = amru.f();
            treeMap.put("vm", f74);
        }
        f74.h(aolc.a(aolf.VIDEO_MANIFEST, aole.BOOLEAN));
        if (treeMap.containsKey("dc")) {
            f75 = (amrp) treeMap.get("dc");
        } else {
            f75 = amru.f();
            treeMap.put("dc", f75);
        }
        f75.h(aolc.a(aolf.DEEP_CROP, aole.FIFE_SAFE_BASE_64));
        if (treeMap.containsKey("rf")) {
            f76 = (amrp) treeMap.get("rf");
        } else {
            f76 = amru.f();
            treeMap.put("rf", f76);
        }
        f76.h(aolc.a(aolf.REQUEST_VIDEO_FAST, aole.BOOLEAN));
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((String) entry.getKey(), amru.B(((amrp) entry.getValue()).g()));
        }
        a = Collections.unmodifiableMap(treeMap2);
    }
}

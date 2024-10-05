package defpackage;

import android.graphics.Color;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zua {
    public static final Map a;
    public static final Map b;
    public static final zpa d;
    public final acpl c;

    static {
        EnumMap enumMap = new EnumMap(axch.class);
        a = enumMap;
        EnumMap enumMap2 = new EnumMap(axch.class);
        b = enumMap2;
        d = new zpa();
        enumMap.put((EnumMap) axch.CLASSIC, (axch) avwz.TEXT_STICKER_FONT_NAME_CLASSIC);
        enumMap.put((EnumMap) axch.LIGHT, (axch) avwz.TEXT_STICKER_FONT_NAME_LIGHT);
        enumMap.put((EnumMap) axch.HEAVY, (axch) avwz.TEXT_STICKER_FONT_NAME_HEAVY);
        enumMap.put((EnumMap) axch.MARKER, (axch) avwz.TEXT_STICKER_FONT_NAME_MARKER);
        enumMap.put((EnumMap) axch.BRUSH, (axch) avwz.TEXT_STICKER_FONT_NAME_BRUSH);
        enumMap.put((EnumMap) axch.TYPEWRITER, (axch) avwz.TEXT_STICKER_FONT_NAME_TYPEWRITER);
        enumMap2.put((EnumMap) axch.CLASSIC, (axch) avxa.TEXT_STICKER_FONT_STYLE_ROBOTO);
        enumMap2.put((EnumMap) axch.LIGHT, (axch) avxa.TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR);
        enumMap2.put((EnumMap) axch.HEAVY, (axch) avxa.TEXT_STICKER_FONT_STYLE_OSWALD_BOLD);
        enumMap2.put((EnumMap) axch.MARKER, (axch) avxa.TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER);
        enumMap2.put((EnumMap) axch.BRUSH, (axch) avxa.TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO);
        enumMap2.put((EnumMap) axch.TYPEWRITER, (axch) avxa.TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE);
    }

    public zua(acpl acplVar) {
        this.c = acplVar;
    }

    public static int a(aoro aoroVar) {
        if (aoroVar == null) {
            return 0;
        }
        return Color.argb((int) aoroVar.f, (int) aoroVar.c, (int) aoroVar.d, (int) aoroVar.e);
    }
}

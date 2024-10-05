package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxc {
    public static final Map a;
    public static final Map b;
    public final Context c;

    static {
        EnumMap enumMap = new EnumMap(zwt.class);
        enumMap.put((EnumMap) zwt.GALLERY, (zwt) oht.o);
        enumMap.put((EnumMap) zwt.IMAGE, (zwt) oht.p);
        enumMap.put((EnumMap) zwt.VIDEO, (zwt) oht.q);
        a = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap2 = new EnumMap(zwt.class);
        enumMap2.put((EnumMap) zwt.GALLERY, (zwt) Integer.valueOf(R.string.all_media_album_display_name));
        enumMap2.put((EnumMap) zwt.IMAGE, (zwt) Integer.valueOf(R.string.photos_album_display_name));
        enumMap2.put((EnumMap) zwt.VIDEO, (zwt) Integer.valueOf(R.string.videos_album_display_name));
        b = Collections.unmodifiableMap(enumMap2);
    }

    public zxc(Context context) {
        this.c = context;
    }

    public static amru a(List list, final zwv zwvVar) {
        List list2;
        if (zwvVar.a == zwt.FOLDER) {
            list2 = (List) aypy.T(list).L(new ayrw() { // from class: zxb
                @Override // defpackage.ayrw
                public final boolean a(Object obj) {
                    zwv zwvVar2 = zwv.this;
                    Map map = zxc.a;
                    return ((DeviceLocalFile) obj).g().equals(zwvVar2.e.c());
                }
            }).av().X();
        } else {
            list2 = (List) aypy.T(list).L((ayrw) a.get(zwvVar.a)).av().X();
        }
        return amru.o(list2);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.widget.ImageView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srm implements syj {
    private final Map a;
    private final Map b;
    private final syd c;

    public srm(Map map, Map map2, syd sydVar) {
        amrw amrwVar = new amrw();
        for (Map.Entry entry : ((amrz) map).entrySet()) {
            ((syi) entry.getValue()).c();
            amrwVar.g(154604025, (syi) entry.getValue());
        }
        this.a = amrwVar.c();
        amrw amrwVar2 = new amrw();
        for (Map.Entry entry2 : ((amrz) map2).entrySet()) {
            amrwVar2.g(Integer.valueOf(((syh) ((Pair) entry2.getValue()).first).b().a()), (Pair) entry2.getValue());
        }
        this.b = amrwVar2.c();
        this.c = sydVar;
    }

    @Override // defpackage.syj
    public final Drawable a(aoam aoamVar, Bitmap bitmap, ImageView.ScaleType scaleType) {
        if (aoamVar.U() == 1) {
            syi syiVar = (syi) this.a.get(Integer.valueOf(aoamVar.T()));
            if (syiVar == null) {
                syd sydVar = this.c;
                int T = aoamVar.T();
                StringBuilder sb = new StringBuilder(88);
                sb.append("Unknown Flatbuffer extension in ImageProcessorExtensionResolverExtension id: ");
                sb.append(T);
                sydVar.b(24, sb.toString());
                return null;
            }
            return syiVar.a(syiVar.b(aoamVar.V()), bitmap, scaleType);
        }
        if (aoamVar.U() == 2) {
            Pair pair = (Pair) this.b.get(Integer.valueOf(aoamVar.T()));
            if (pair == null) {
                syd sydVar2 = this.c;
                int T2 = aoamVar.T();
                StringBuilder sb2 = new StringBuilder(82);
                sb2.append("ImageProcessorExtensionResolver: Unknown PB image processor extension: ");
                sb2.append(T2);
                sydVar2.b(24, sb2.toString());
                return null;
            }
            try {
                return ((syh) pair.first).a(rwh.ac(aoamVar.V(), (aopf) pair.second), bitmap, scaleType);
            } catch (aoob e) {
                syd sydVar3 = this.c;
                int T3 = aoamVar.T();
                StringBuilder sb3 = new StringBuilder(106);
                sb3.append("Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver. Extension id: ");
                sb3.append(T3);
                sydVar3.d(24, sb3.toString(), e);
                return null;
            }
        }
        syd sydVar4 = this.c;
        int T4 = aoamVar.T();
        StringBuilder sb4 = new StringBuilder(75);
        sb4.append("ImageProcessorExtensionResolver: extension with unknown format: ");
        sb4.append(T4);
        sydVar4.b(24, sb4.toString());
        return null;
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class icf implements ykl {
    final /* synthetic */ axcg a;
    final /* synthetic */ icg b;

    public icf(icg icgVar, axcg axcgVar) {
        this.b = icgVar;
        this.a = axcgVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        afsi.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.f.aT(this.a.toBuilder());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        axbz axbzVar;
        axbz axbzVar2;
        Uri uri = (Uri) obj;
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(this.b.d, 0));
        ImageView imageView = (ImageView) from.inflate(R.layout.day_of_week_sticker, (ViewGroup) null);
        imageView.setImageDrawable((Drawable) obj2);
        Bitmap A = wcy.A(from.getContext(), imageView);
        final icg icgVar = this.b;
        axcg axcgVar = this.a;
        axdk c = axcgVar.c();
        axdi i = c.i();
        if (i.c == 12) {
            axbzVar = (axbz) i.d;
        } else {
            axbzVar = axbz.a;
        }
        axca axcaVar = axbzVar.d;
        if (axcaVar == null) {
            axcaVar = axca.b;
        }
        aone builder = axcaVar.toBuilder();
        axcb axcbVar = icgVar.i;
        builder.copyOnWrite();
        axca axcaVar2 = (axca) builder.instance;
        axcaVar2.d = axcbVar.d;
        axcaVar2.c |= 1;
        axca axcaVar3 = (axca) builder.build();
        String str = (String) etx.F(uri).c();
        axdj axdjVar = (axdj) c.toBuilder();
        aone builder2 = c.i().toBuilder();
        axdi i2 = c.i();
        if (i2.c == 12) {
            axbzVar2 = (axbz) i2.d;
        } else {
            axbzVar2 = axbz.a;
        }
        aone builder3 = axbzVar2.toBuilder();
        builder3.copyOnWrite();
        axbz axbzVar3 = (axbz) builder3.instance;
        axcaVar3.getClass();
        axbzVar3.d = axcaVar3;
        axbzVar3.b |= 2;
        aone createBuilder = axbp.a.createBuilder();
        createBuilder.copyOnWrite();
        axbp axbpVar = (axbp) createBuilder.instance;
        axbpVar.b = 1;
        axbpVar.c = str;
        axbp axbpVar2 = (axbp) createBuilder.build();
        builder3.copyOnWrite();
        axbz axbzVar4 = (axbz) builder3.instance;
        axbpVar2.getClass();
        axbzVar4.c = axbpVar2;
        axbzVar4.b |= 1;
        builder2.copyOnWrite();
        axdi axdiVar = (axdi) builder2.instance;
        axbz axbzVar5 = (axbz) builder3.build();
        axbzVar5.getClass();
        axdiVar.d = axbzVar5;
        axdiVar.c = 12;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder2.build());
        final aone builder4 = axcgVar.toBuilder();
        axdk axdkVar = (axdk) axdjVar.build();
        builder4.copyOnWrite();
        ((axcg) builder4.instance).e(axdkVar);
        etx.D(icgVar.d, A, axdjVar, new ici() { // from class: icd
            @Override // defpackage.ici
            public final void a(axdj axdjVar2) {
                icg icgVar2 = icg.this;
                aone aoneVar = builder4;
                aoneVar.copyOnWrite();
                ((axcg) aoneVar.instance).e((axdk) axdjVar2.build());
                icgVar2.f.aT(aoneVar);
            }
        });
    }
}

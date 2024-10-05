package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class gtr implements aaha {
    protected final Context a;
    protected final ypa b;
    protected final zaw c;
    protected final azrw d;
    protected final gtq e;
    public final Executor f;
    protected AlertDialog g;

    public gtr(Context context, ypa ypaVar, aaxr aaxrVar, zaw zawVar, azrw azrwVar, gtq gtqVar, Executor executor) {
        this.a = context;
        ypaVar.getClass();
        this.b = ypaVar;
        aaxrVar.getClass();
        zawVar.getClass();
        this.c = zawVar;
        azrwVar.getClass();
        this.d = azrwVar;
        gtqVar.getClass();
        this.e = gtqVar;
        this.f = executor;
    }

    protected abstract int b();

    protected abstract int c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aasz e(apxf apxfVar, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(apxf apxfVar) {
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        this.g = new AlertDialog.Builder(this.a).setMessage(new SpannableString(this.a.getText(c()))).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        final Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        this.g.setButton(-1, this.a.getText(b()), new DialogInterface.OnClickListener() { // from class: gtn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gtr gtrVar = gtr.this;
                final apxf apxfVar2 = apxfVar;
                final Object obj = s;
                aaru aaruVar = (aaru) gtrVar.d.get();
                aaruVar.l(whl.G(apxfVar2));
                ynm.l(gtrVar.e.a(aaruVar), gtrVar.f, new gto(gtrVar.c, 0), new ynl() { // from class: gtp
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        gtr gtrVar2 = gtr.this;
                        apxf apxfVar3 = apxfVar2;
                        Object obj3 = obj;
                        whu.K(gtrVar2.a, gtrVar2.d(), 1);
                        gtrVar2.b.f(gtrVar2.e(apxfVar3, obj3));
                        gtrVar2.f(apxfVar3);
                    }
                }, anij.a);
            }
        });
        this.g.show();
        TextView textView = (TextView) this.g.findViewById(android.R.id.message);
        Linkify.addLinks(textView, 1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

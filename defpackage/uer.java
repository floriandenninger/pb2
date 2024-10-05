package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uer implements ued {
    public static final Map a = DesugarCollections.synchronizedMap(new adz());
    public static final Map b = DesugarCollections.synchronizedMap(new adz());
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ComponentCallbacks2 d = new uef();
    public final Executor e;
    public final uix f;
    public final tyo g;

    public uer(Context context, ExecutorService executorService, tyo tyoVar, uiz uizVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        uiz uizVar2;
        tyo tyoVar2;
        aloh alohVar = new aloh(context, (char[]) null, (byte[]) null);
        uiv uivVar = new uiv();
        uivVar.a(new uiw[0]);
        if (uizVar != null) {
            uivVar.a = uizVar;
            uivVar.d = new tyo();
            uivVar.b = new uee(alohVar, tyoVar, null, null, null, null);
            uivVar.a(uiw.a);
            uiz uizVar3 = uivVar.a;
            if (uizVar3 == null || (uizVar2 = uivVar.b) == null || (tyoVar2 = uivVar.d) == null) {
                StringBuilder sb = new StringBuilder();
                if (uivVar.a == null) {
                    sb.append(" imageRetriever");
                }
                if (uivVar.b == null) {
                    sb.append(" secondaryImageRetriever");
                }
                if (uivVar.d == null) {
                    sb.append(" defaultImageRetriever");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            uix uixVar = new uix(uizVar3, uizVar2, tyoVar2, uivVar.c, null);
            this.e = executorService;
            this.f = uixVar;
            this.g = tyoVar;
            return;
        }
        throw new NullPointerException("Null imageRetriever");
    }

    public static void a(ImageView imageView, ueq ueqVar) {
        uqq.j();
        ueq ueqVar2 = (ueq) imageView.getTag(R.id.tag_account_image_request);
        if (ueqVar2 != null) {
            ueqVar2.d = true;
        }
        imageView.setTag(R.id.tag_account_image_request, ueqVar);
    }
}

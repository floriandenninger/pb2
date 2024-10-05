package defpackage;

import com.google.android.youtube.R;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lbx implements Runnable {
    final /* synthetic */ lbz a;
    private final akef b;

    public lbx(lbz lbzVar, akef akefVar) {
        this.a = lbzVar;
        this.b = akefVar;
    }

    private final void a() {
        this.a.ap.runOnUiThread(new Runnable() { // from class: lbw
            @Override // java.lang.Runnable
            public final void run() {
                whu.K(lbx.this.a.ap, R.string.delete_search_suggestion_error, 0);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            akev a = this.a.e.a();
            akef akefVar = this.b;
            akefVar.getClass();
            if (akefVar.b()) {
                akel akelVar = new akel();
                akelVar.e = akefVar.e;
                akelVar.d(a.e(), a.g());
                if (a.b.d(akelVar)) {
                    return;
                }
            }
            a();
        } catch (IOException e) {
            lbz lbzVar = this.a;
            axze axzeVar = lbzVar.aP;
            aksl akslVar = lbzVar.an;
            if (axzeVar.s() && akslVar != null) {
                akslVar.c("IOException", "DeleteSuggestion");
            }
            this.a.aP.r("Error deleting search suggestions", e);
            zga.n("Error deleting search suggestions", e);
            a();
        }
    }
}

package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abli implements TextWatcher {
    final /* synthetic */ ablm a;
    private final /* synthetic */ int b;

    public abli(ablm ablmVar, int i) {
        this.b = i;
        this.a = ablmVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b == 0) {
            aspz aspzVar = this.a.q;
            if (aspzVar == null || aspzVar.g.size() == 0) {
                return;
            }
            int size = this.a.q.g.size();
            long j = ((asqb) this.a.q.g.get(0)).c;
            long j2 = ((asqb) this.a.q.g.get(size - 1)).d;
            long f = this.a.f(String.valueOf(charSequence));
            this.a.p(f);
            ablm ablmVar = this.a;
            ablmVar.l(ablmVar.g(f));
            ablm ablmVar2 = this.a;
            ablmVar2.h = f < j || f > j2;
            ablmVar2.e();
            return;
        }
        ablm ablmVar3 = this.a;
        ablmVar3.o(ablmVar3.n.b(ablmVar3.d.getText(), this.a.p), this.a.o);
    }
}

package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnm extends alif {
    final /* synthetic */ alnr a;

    public alnm(alnr alnrVar) {
        this.a = alnrVar;
    }

    @Override // defpackage.alif, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.m.setChecked(!r1.a());
    }
}

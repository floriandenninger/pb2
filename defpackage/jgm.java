package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jgm implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ jgo a;

    public jgm(jgo jgoVar) {
        this.a = jgoVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        adlm adlmVar = this.a.e;
        adlmVar.getClass();
        adlmVar.al(true != z ? 3 : 2);
    }
}

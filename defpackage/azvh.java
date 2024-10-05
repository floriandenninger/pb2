package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvh extends azum implements aztu {
    final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azvh(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    @Override // defpackage.aztu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        azuw azuwVar = (azuw) obj;
        azuwVar.getClass();
        return this.a.subSequence(Integer.valueOf(azuwVar.a).intValue(), Integer.valueOf(azuwVar.b).intValue() + 1).toString();
    }
}

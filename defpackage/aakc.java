package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aakc extends aajj {
    private final aakl a;
    private final String b;
    private final aoqa c;

    public aakc(aakl aaklVar, String str, aoqa aoqaVar) {
        this.a = aaklVar;
        this.b = str;
        this.c = aoqaVar;
    }

    @Override // defpackage.aajj
    public final void b(aaka aakaVar, viq viqVar, amrp amrpVar) {
        aakt aaktVar;
        aaln c = this.a.c(viqVar, this.b);
        if (!aalj.d(c.d, this.c) || (aaktVar = c.b) == null) {
            return;
        }
        if (amrpVar != null) {
            aakx a = aakz.a();
            a.c(this.b);
            a.a = aaktVar;
            a.d(c.c);
            a.b(aaku.a);
            amrpVar.h(a.a());
        }
        String str = this.b;
        try {
            String[] strArr = {str};
            viq.c();
            StringBuilder sb = new StringBuilder(36);
            sb.append("DELETE FROM ");
            sb.append("entity_table");
            sb.append(" WHERE ");
            sb.append("key=?");
            amil l = amjw.l(sb.toString());
            try {
                viqVar.b.delete("entity_table", "key=?", strArr);
                l.close();
                viqVar.e("DELETE FROM entity_associations WHERE parent_entity_key=? OR child_entity_key=?", str, str);
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw aaiq.c(e, (int) d(str));
        }
    }
}

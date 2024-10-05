package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccq {
    public final btl a;
    private final btg b;
    private final btp c;

    public ccq(btl btlVar) {
        this.a = btlVar;
        this.b = new cco(btlVar);
        this.c = new ccp(btlVar);
    }

    public final ccn a(String str) {
        btn a = btn.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            return e.moveToFirst() ? new ccn(e.getString(jr.h(e, "work_spec_id")), e.getInt(jr.h(e, "system_id"))) : null;
        } finally {
            e.close();
            a.i();
        }
    }

    public final void b(ccn ccnVar) {
        this.a.g();
        this.a.h();
        try {
            this.b.b(ccnVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final void c(String str) {
        this.a.g();
        buu d = this.c.d();
        if (str == null) {
            d.e(1);
        } else {
            d.f(1, str);
        }
        this.a.h();
        try {
            d.b();
            this.a.j();
        } finally {
            this.a.i();
            this.c.e(d);
        }
    }
}

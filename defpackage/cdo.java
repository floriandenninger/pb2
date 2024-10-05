package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdo {
    public final btl a;
    public final btg b;

    public cdo(btl btlVar, byte[] bArr, byte[] bArr2) {
        this.a = btlVar;
        this.b = new cck(btlVar);
    }

    public final List a(String str) {
        btn a = btn.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                arrayList.add(e.getString(0));
            }
            return arrayList;
        } finally {
            e.close();
            a.i();
        }
    }

    public final Long b(String str) {
        btn a = btn.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.f(1, str);
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            Long l = null;
            if (e.moveToFirst() && !e.isNull(0)) {
                l = Long.valueOf(e.getLong(0));
            }
            return l;
        } finally {
            e.close();
            a.i();
        }
    }

    public final void c(ccl cclVar) {
        this.a.g();
        this.a.h();
        try {
            this.b.b(cclVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final List d(String str) {
        btn a = btn.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                arrayList.add(e.getString(0));
            }
            return arrayList;
        } finally {
            e.close();
            a.i();
        }
    }

    public cdo(btl btlVar, char[] cArr) {
        this.a = btlVar;
        this.b = new ccm(btlVar);
    }

    public cdo(btl btlVar, byte[] bArr) {
        this.a = btlVar;
        this.b = new ccr(btlVar);
    }

    public cdo(btl btlVar) {
        this.a = btlVar;
        this.b = new cdn(btlVar);
    }
}

package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdl implements cdb {
    public final btl a;
    public final btg b;
    public final btp c;
    public final btp d;
    public final btp e;
    private final btp f;
    private final btp g;
    private final btp h;
    private final btp i;

    public cdl(btl btlVar) {
        this.a = btlVar;
        this.b = new cdc(btlVar);
        this.f = new cdd(btlVar);
        this.g = new cde(btlVar);
        this.h = new cdf(btlVar);
        this.c = new cdg(btlVar);
        this.d = new cdh(btlVar);
        this.i = new cdi(btlVar);
        this.e = new cdj(btlVar);
        new cdk(btlVar);
    }

    @Override // defpackage.cdb
    public final cda a(String str) {
        btn btnVar;
        cda cdaVar;
        btn a = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            int h = jr.h(e, "required_network_type");
            int h2 = jr.h(e, "requires_charging");
            int h3 = jr.h(e, "requires_device_idle");
            int h4 = jr.h(e, "requires_battery_not_low");
            int h5 = jr.h(e, "requires_storage_not_low");
            int h6 = jr.h(e, "trigger_content_update_delay");
            int h7 = jr.h(e, "trigger_max_content_delay");
            int h8 = jr.h(e, "content_uri_triggers");
            int h9 = jr.h(e, "id");
            int h10 = jr.h(e, "state");
            int h11 = jr.h(e, "worker_class_name");
            int h12 = jr.h(e, "input_merger_class_name");
            int h13 = jr.h(e, "input");
            int h14 = jr.h(e, "output");
            btnVar = a;
            try {
                int h15 = jr.h(e, "initial_delay");
                int h16 = jr.h(e, "interval_duration");
                int h17 = jr.h(e, "flex_duration");
                int h18 = jr.h(e, "run_attempt_count");
                int h19 = jr.h(e, "backoff_policy");
                int h20 = jr.h(e, "backoff_delay_duration");
                int h21 = jr.h(e, "period_start_time");
                int h22 = jr.h(e, "minimum_retention_duration");
                int h23 = jr.h(e, "schedule_requested_at");
                int h24 = jr.h(e, "run_in_foreground");
                int h25 = jr.h(e, "out_of_quota_policy");
                if (e.moveToFirst()) {
                    String string = e.getString(h9);
                    String string2 = e.getString(h11);
                    byo byoVar = new byo();
                    byoVar.i = abn.m(e.getInt(h));
                    byoVar.b = e.getInt(h2) != 0;
                    byoVar.c = e.getInt(h3) != 0;
                    byoVar.d = e.getInt(h4) != 0;
                    byoVar.e = e.getInt(h5) != 0;
                    byoVar.f = e.getLong(h6);
                    byoVar.g = e.getLong(h7);
                    byoVar.h = abn.j(e.getBlob(h8));
                    cdaVar = new cda(string, string2);
                    cdaVar.r = abn.n(e.getInt(h10));
                    cdaVar.e = e.getString(h12);
                    cdaVar.f = byr.a(e.getBlob(h13));
                    cdaVar.g = byr.a(e.getBlob(h14));
                    cdaVar.h = e.getLong(h15);
                    cdaVar.i = e.getLong(h16);
                    cdaVar.j = e.getLong(h17);
                    cdaVar.l = e.getInt(h18);
                    cdaVar.s = abn.l(e.getInt(h19));
                    cdaVar.m = e.getLong(h20);
                    cdaVar.n = e.getLong(h21);
                    cdaVar.o = e.getLong(h22);
                    cdaVar.p = e.getLong(h23);
                    cdaVar.q = e.getInt(h24) != 0;
                    cdaVar.t = abn.o(e.getInt(h25));
                    cdaVar.k = byoVar;
                } else {
                    cdaVar = null;
                }
                e.close();
                btnVar.i();
                return cdaVar;
            } catch (Throwable th) {
                th = th;
                e.close();
                btnVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            btnVar = a;
        }
    }

    @Override // defpackage.cdb
    public final List b() {
        btn btnVar;
        int h;
        int h2;
        int h3;
        int h4;
        int h5;
        int h6;
        int h7;
        int h8;
        int h9;
        int h10;
        int h11;
        int h12;
        int h13;
        int h14;
        btn a = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            h = jr.h(e, "required_network_type");
            h2 = jr.h(e, "requires_charging");
            h3 = jr.h(e, "requires_device_idle");
            h4 = jr.h(e, "requires_battery_not_low");
            h5 = jr.h(e, "requires_storage_not_low");
            h6 = jr.h(e, "trigger_content_update_delay");
            h7 = jr.h(e, "trigger_max_content_delay");
            h8 = jr.h(e, "content_uri_triggers");
            h9 = jr.h(e, "id");
            h10 = jr.h(e, "state");
            h11 = jr.h(e, "worker_class_name");
            h12 = jr.h(e, "input_merger_class_name");
            h13 = jr.h(e, "input");
            h14 = jr.h(e, "output");
            btnVar = a;
        } catch (Throwable th) {
            th = th;
            btnVar = a;
        }
        try {
            int h15 = jr.h(e, "initial_delay");
            int h16 = jr.h(e, "interval_duration");
            int h17 = jr.h(e, "flex_duration");
            int h18 = jr.h(e, "run_attempt_count");
            int h19 = jr.h(e, "backoff_policy");
            int h20 = jr.h(e, "backoff_delay_duration");
            int h21 = jr.h(e, "period_start_time");
            int h22 = jr.h(e, "minimum_retention_duration");
            int h23 = jr.h(e, "schedule_requested_at");
            int h24 = jr.h(e, "run_in_foreground");
            int h25 = jr.h(e, "out_of_quota_policy");
            int i = h14;
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                String string = e.getString(h9);
                int i2 = h9;
                String string2 = e.getString(h11);
                int i3 = h11;
                byo byoVar = new byo();
                int i4 = h;
                byoVar.i = abn.m(e.getInt(h));
                byoVar.b = e.getInt(h2) != 0;
                byoVar.c = e.getInt(h3) != 0;
                byoVar.d = e.getInt(h4) != 0;
                byoVar.e = e.getInt(h5) != 0;
                int i5 = h2;
                int i6 = h3;
                byoVar.f = e.getLong(h6);
                byoVar.g = e.getLong(h7);
                byoVar.h = abn.j(e.getBlob(h8));
                cda cdaVar = new cda(string, string2);
                cdaVar.r = abn.n(e.getInt(h10));
                cdaVar.e = e.getString(h12);
                cdaVar.f = byr.a(e.getBlob(h13));
                int i7 = i;
                cdaVar.g = byr.a(e.getBlob(i7));
                i = i7;
                int i8 = h15;
                cdaVar.h = e.getLong(i8);
                int i9 = h13;
                int i10 = h16;
                cdaVar.i = e.getLong(i10);
                int i11 = h4;
                int i12 = h17;
                cdaVar.j = e.getLong(i12);
                int i13 = h18;
                cdaVar.l = e.getInt(i13);
                int i14 = h19;
                cdaVar.s = abn.l(e.getInt(i14));
                h17 = i12;
                int i15 = h20;
                cdaVar.m = e.getLong(i15);
                int i16 = h21;
                cdaVar.n = e.getLong(i16);
                h21 = i16;
                int i17 = h22;
                cdaVar.o = e.getLong(i17);
                int i18 = h23;
                cdaVar.p = e.getLong(i18);
                int i19 = h24;
                cdaVar.q = e.getInt(i19) != 0;
                int i20 = h25;
                cdaVar.t = abn.o(e.getInt(i20));
                cdaVar.k = byoVar;
                arrayList.add(cdaVar);
                h25 = i20;
                h2 = i5;
                h13 = i9;
                h15 = i8;
                h16 = i10;
                h18 = i13;
                h23 = i18;
                h9 = i2;
                h11 = i3;
                h = i4;
                h24 = i19;
                h22 = i17;
                h3 = i6;
                h20 = i15;
                h4 = i11;
                h19 = i14;
            }
            e.close();
            btnVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            e.close();
            btnVar.i();
            throw th;
        }
    }

    @Override // defpackage.cdb
    public final List c() {
        btn btnVar;
        int h;
        int h2;
        int h3;
        int h4;
        int h5;
        int h6;
        int h7;
        int h8;
        int h9;
        int h10;
        int h11;
        int h12;
        int h13;
        int h14;
        btn a = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            h = jr.h(e, "required_network_type");
            h2 = jr.h(e, "requires_charging");
            h3 = jr.h(e, "requires_device_idle");
            h4 = jr.h(e, "requires_battery_not_low");
            h5 = jr.h(e, "requires_storage_not_low");
            h6 = jr.h(e, "trigger_content_update_delay");
            h7 = jr.h(e, "trigger_max_content_delay");
            h8 = jr.h(e, "content_uri_triggers");
            h9 = jr.h(e, "id");
            h10 = jr.h(e, "state");
            h11 = jr.h(e, "worker_class_name");
            h12 = jr.h(e, "input_merger_class_name");
            h13 = jr.h(e, "input");
            h14 = jr.h(e, "output");
            btnVar = a;
        } catch (Throwable th) {
            th = th;
            btnVar = a;
        }
        try {
            int h15 = jr.h(e, "initial_delay");
            int h16 = jr.h(e, "interval_duration");
            int h17 = jr.h(e, "flex_duration");
            int h18 = jr.h(e, "run_attempt_count");
            int h19 = jr.h(e, "backoff_policy");
            int h20 = jr.h(e, "backoff_delay_duration");
            int h21 = jr.h(e, "period_start_time");
            int h22 = jr.h(e, "minimum_retention_duration");
            int h23 = jr.h(e, "schedule_requested_at");
            int h24 = jr.h(e, "run_in_foreground");
            int h25 = jr.h(e, "out_of_quota_policy");
            int i = h14;
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                String string = e.getString(h9);
                int i2 = h9;
                String string2 = e.getString(h11);
                int i3 = h11;
                byo byoVar = new byo();
                int i4 = h;
                byoVar.i = abn.m(e.getInt(h));
                byoVar.b = e.getInt(h2) != 0;
                byoVar.c = e.getInt(h3) != 0;
                byoVar.d = e.getInt(h4) != 0;
                byoVar.e = e.getInt(h5) != 0;
                int i5 = h2;
                int i6 = h3;
                byoVar.f = e.getLong(h6);
                byoVar.g = e.getLong(h7);
                byoVar.h = abn.j(e.getBlob(h8));
                cda cdaVar = new cda(string, string2);
                cdaVar.r = abn.n(e.getInt(h10));
                cdaVar.e = e.getString(h12);
                cdaVar.f = byr.a(e.getBlob(h13));
                int i7 = i;
                cdaVar.g = byr.a(e.getBlob(i7));
                i = i7;
                int i8 = h15;
                cdaVar.h = e.getLong(i8);
                int i9 = h13;
                int i10 = h16;
                cdaVar.i = e.getLong(i10);
                int i11 = h4;
                int i12 = h17;
                cdaVar.j = e.getLong(i12);
                int i13 = h18;
                cdaVar.l = e.getInt(i13);
                int i14 = h19;
                cdaVar.s = abn.l(e.getInt(i14));
                h17 = i12;
                int i15 = h20;
                cdaVar.m = e.getLong(i15);
                int i16 = h21;
                cdaVar.n = e.getLong(i16);
                h21 = i16;
                int i17 = h22;
                cdaVar.o = e.getLong(i17);
                int i18 = h23;
                cdaVar.p = e.getLong(i18);
                int i19 = h24;
                cdaVar.q = e.getInt(i19) != 0;
                int i20 = h25;
                cdaVar.t = abn.o(e.getInt(i20));
                cdaVar.k = byoVar;
                arrayList.add(cdaVar);
                h25 = i20;
                h2 = i5;
                h13 = i9;
                h15 = i8;
                h16 = i10;
                h18 = i13;
                h23 = i18;
                h9 = i2;
                h11 = i3;
                h = i4;
                h24 = i19;
                h22 = i17;
                h3 = i6;
                h20 = i15;
                h4 = i11;
                h19 = i14;
            }
            e.close();
            btnVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            e.close();
            btnVar.i();
            throw th;
        }
    }

    @Override // defpackage.cdb
    public final List d(String str) {
        btn a = btn.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            int h = jr.h(e, "id");
            int h2 = jr.h(e, "state");
            ArrayList arrayList = new ArrayList(e.getCount());
            while (e.moveToNext()) {
                ccy ccyVar = new ccy();
                ccyVar.a = e.getString(h);
                ccyVar.b = abn.n(e.getInt(h2));
                arrayList.add(ccyVar);
            }
            return arrayList;
        } finally {
            e.close();
            a.i();
        }
    }

    @Override // defpackage.cdb
    public final void e(String str) {
        this.a.g();
        buu d = this.f.d();
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
            this.f.e(d);
        }
    }

    @Override // defpackage.cdb
    public final void f(String str, byr byrVar) {
        this.a.g();
        buu d = this.g.d();
        byte[] e = byr.e(byrVar);
        if (e == null) {
            d.e(1);
        } else {
            d.c(1, e);
        }
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.h();
        try {
            d.b();
            this.a.j();
        } finally {
            this.a.i();
            this.g.e(d);
        }
    }

    @Override // defpackage.cdb
    public final void g(String str, long j) {
        this.a.g();
        buu d = this.h.d();
        d.d(1, j);
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.h();
        try {
            d.b();
            this.a.j();
        } finally {
            this.a.i();
            this.h.e(d);
        }
    }

    @Override // defpackage.cdb
    public final int h(String str) {
        btn a = btn.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            return e.moveToFirst() ? abn.n(e.getInt(0)) : 0;
        } finally {
            e.close();
            a.i();
        }
    }

    @Override // defpackage.cdb
    public final List i() {
        btn btnVar;
        btn a = btn.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        a.d(1, 200L);
        this.a.g();
        Cursor e = jr.e(this.a, a, false);
        try {
            int h = jr.h(e, "required_network_type");
            int h2 = jr.h(e, "requires_charging");
            int h3 = jr.h(e, "requires_device_idle");
            int h4 = jr.h(e, "requires_battery_not_low");
            int h5 = jr.h(e, "requires_storage_not_low");
            int h6 = jr.h(e, "trigger_content_update_delay");
            int h7 = jr.h(e, "trigger_max_content_delay");
            int h8 = jr.h(e, "content_uri_triggers");
            int h9 = jr.h(e, "id");
            int h10 = jr.h(e, "state");
            int h11 = jr.h(e, "worker_class_name");
            int h12 = jr.h(e, "input_merger_class_name");
            int h13 = jr.h(e, "input");
            int h14 = jr.h(e, "output");
            btnVar = a;
            try {
                int h15 = jr.h(e, "initial_delay");
                int h16 = jr.h(e, "interval_duration");
                int h17 = jr.h(e, "flex_duration");
                int h18 = jr.h(e, "run_attempt_count");
                int h19 = jr.h(e, "backoff_policy");
                int h20 = jr.h(e, "backoff_delay_duration");
                int h21 = jr.h(e, "period_start_time");
                int h22 = jr.h(e, "minimum_retention_duration");
                int h23 = jr.h(e, "schedule_requested_at");
                int h24 = jr.h(e, "run_in_foreground");
                int h25 = jr.h(e, "out_of_quota_policy");
                int i = h14;
                ArrayList arrayList = new ArrayList(e.getCount());
                while (e.moveToNext()) {
                    String string = e.getString(h9);
                    int i2 = h9;
                    String string2 = e.getString(h11);
                    int i3 = h11;
                    byo byoVar = new byo();
                    int i4 = h;
                    byoVar.i = abn.m(e.getInt(h));
                    byoVar.b = e.getInt(h2) != 0;
                    byoVar.c = e.getInt(h3) != 0;
                    byoVar.d = e.getInt(h4) != 0;
                    byoVar.e = e.getInt(h5) != 0;
                    int i5 = h2;
                    int i6 = h3;
                    byoVar.f = e.getLong(h6);
                    byoVar.g = e.getLong(h7);
                    byoVar.h = abn.j(e.getBlob(h8));
                    cda cdaVar = new cda(string, string2);
                    cdaVar.r = abn.n(e.getInt(h10));
                    cdaVar.e = e.getString(h12);
                    cdaVar.f = byr.a(e.getBlob(h13));
                    int i7 = i;
                    cdaVar.g = byr.a(e.getBlob(i7));
                    i = i7;
                    int i8 = h15;
                    cdaVar.h = e.getLong(i8);
                    int i9 = h12;
                    int i10 = h16;
                    cdaVar.i = e.getLong(i10);
                    int i11 = h4;
                    int i12 = h17;
                    cdaVar.j = e.getLong(i12);
                    int i13 = h18;
                    cdaVar.l = e.getInt(i13);
                    int i14 = h19;
                    cdaVar.s = abn.l(e.getInt(i14));
                    h17 = i12;
                    int i15 = h20;
                    cdaVar.m = e.getLong(i15);
                    int i16 = h21;
                    cdaVar.n = e.getLong(i16);
                    h21 = i16;
                    int i17 = h22;
                    cdaVar.o = e.getLong(i17);
                    int i18 = h23;
                    cdaVar.p = e.getLong(i18);
                    int i19 = h24;
                    cdaVar.q = e.getInt(i19) != 0;
                    int i20 = h25;
                    cdaVar.t = abn.o(e.getInt(i20));
                    cdaVar.k = byoVar;
                    arrayList.add(cdaVar);
                    h25 = i20;
                    h2 = i5;
                    h12 = i9;
                    h15 = i8;
                    h16 = i10;
                    h18 = i13;
                    h23 = i18;
                    h9 = i2;
                    h11 = i3;
                    h = i4;
                    h24 = i19;
                    h22 = i17;
                    h3 = i6;
                    h20 = i15;
                    h4 = i11;
                    h19 = i14;
                }
                e.close();
                btnVar.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                e.close();
                btnVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            btnVar = a;
        }
    }

    @Override // defpackage.cdb
    public final void j(String str, long j) {
        this.a.g();
        buu d = this.i.d();
        d.d(1, j);
        if (str == null) {
            d.e(2);
        } else {
            d.f(2, str);
        }
        this.a.h();
        try {
            d.b();
            this.a.j();
        } finally {
            this.a.i();
            this.i.e(d);
        }
    }

    @Override // defpackage.cdb
    public final void k(int i, String... strArr) {
        this.a.g();
        StringBuilder j = js.j();
        j.append("UPDATE workspec SET state=? WHERE id IN (");
        js.k(j, 1);
        j.append(")");
        buu l = this.a.l(j.toString());
        l.d(1, abn.k(i));
        int i2 = 2;
        for (char c = 0; c <= 0; c = 1) {
            String str = strArr[0];
            if (str == null) {
                l.e(i2);
            } else {
                l.f(i2, str);
            }
            i2++;
        }
        this.a.h();
        try {
            l.b();
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final void l(adz adzVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = adzVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (adzVar.j > 999) {
            adz adzVar2 = new adz(999);
            int i2 = adzVar.j;
            int i3 = 0;
            loop0: while (true) {
                i = 0;
                while (i3 < i2) {
                    adzVar2.put((String) adzVar.f(i3), (ArrayList) adzVar.i(i3));
                    i3++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                l(adzVar2);
                adzVar2 = new adz(999);
            }
            if (i > 0) {
                l(adzVar2);
                return;
            }
            return;
        }
        StringBuilder j = js.j();
        j.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        js.k(j, size);
        j.append(")");
        btn a = btn.a(j.toString(), size);
        int i4 = 1;
        for (String str : keySet) {
            if (str == null) {
                a.e(i4);
            } else {
                a.f(i4, str);
            }
            i4++;
        }
        Cursor e = jr.e(this.a, a, false);
        try {
            int g = jr.g(e, "work_spec_id");
            if (g != -1) {
                while (e.moveToNext()) {
                    if (!e.isNull(g) && (arrayList = (ArrayList) adzVar.get(e.getString(g))) != null) {
                        arrayList.add(byr.a(e.getBlob(0)));
                    }
                }
            }
        } finally {
            e.close();
        }
    }

    public final void m(adz adzVar) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = adzVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (adzVar.j > 999) {
            adz adzVar2 = new adz(999);
            int i2 = adzVar.j;
            int i3 = 0;
            loop0: while (true) {
                i = 0;
                while (i3 < i2) {
                    adzVar2.put((String) adzVar.f(i3), (ArrayList) adzVar.i(i3));
                    i3++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                m(adzVar2);
                adzVar2 = new adz(999);
            }
            if (i > 0) {
                m(adzVar2);
                return;
            }
            return;
        }
        StringBuilder j = js.j();
        j.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        js.k(j, size);
        j.append(")");
        btn a = btn.a(j.toString(), size);
        int i4 = 1;
        for (String str : keySet) {
            if (str == null) {
                a.e(i4);
            } else {
                a.f(i4, str);
            }
            i4++;
        }
        Cursor e = jr.e(this.a, a, false);
        try {
            int g = jr.g(e, "work_spec_id");
            if (g != -1) {
                while (e.moveToNext()) {
                    if (!e.isNull(g) && (arrayList = (ArrayList) adzVar.get(e.getString(g))) != null) {
                        arrayList.add(e.getString(0));
                    }
                }
            }
        } finally {
            e.close();
        }
    }
}

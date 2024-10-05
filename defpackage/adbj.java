package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbj extends aday {
    public adbi a;

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        adbi adbiVar = this.a;
        adbiVar.h.unregisterReceiver(adbiVar.t);
        ((bpw) adbiVar.b.get()).r(adbiVar.w);
        adbiVar.d.G();
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (!this.K) {
            this.K = true;
            if (!ar() || this.G) {
                return;
            }
            this.A.c();
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        adbi adbiVar = this.a;
        adbiVar.d.F();
        if (adbiVar.t == null) {
            adbiVar.t = new adbg(adbiVar);
        }
        adbiVar.h.registerReceiver(adbiVar.t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        adbiVar.d();
        ((bpw) adbiVar.b.get()).q(adbiVar.c, adbiVar.w, 1);
        adbiVar.c();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final adbi adbiVar = this.a;
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.mdx_pair_with_tv_fragment, viewGroup, false);
        adbiVar.h = inflate.getContext();
        adbiVar.v = new Handler(Looper.getMainLooper());
        adbiVar.g = adbiVar.e;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atcc.a);
        adbiVar.g.d(acsb.b(27846), (apxf) aongVar.build(), null);
        adbiVar.i = (ScrollView) inflate;
        adbiVar.j = (TextView) inflate.findViewById(R.id.header);
        adbiVar.k = (LinearLayout) inflate.findViewById(R.id.available_tv_container);
        adbiVar.l = new ArrayList(10);
        final int i2 = 1;
        adbiVar.m = new View.OnClickListener() { // from class: adbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                if (i3 == 0) {
                    adbi adbiVar2 = adbiVar;
                    if (!adbiVar2.u) {
                        adbiVar2.g.I(3, new acqx(acsb.c(27851)), null);
                        adbiVar2.a.C().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                        return;
                    } else {
                        adbiVar2.g.I(3, new acqx(acsb.c(27852)), null);
                        adbiVar2.a();
                        return;
                    }
                }
                if (i3 == 1) {
                    final adbi adbiVar3 = adbiVar;
                    final bpv bpvVar = (bpv) view.getTag();
                    if (!bpvVar.m()) {
                        adbiVar3.g.I(3, new acqx(acsb.c(27847)), null);
                        if (adbiVar3.f.a(false, new adct() { // from class: adbd
                            @Override // defpackage.adct
                            public final void a() {
                                adbi.this.b(bpvVar);
                            }
                        }, "")) {
                            return;
                        }
                        adbiVar3.b(bpvVar);
                        return;
                    }
                    adbiVar3.g.I(3, new acqx(acsb.c(27848)), null);
                    adbiVar3.d.K();
                    return;
                }
                if (i3 == 2) {
                    adbi adbiVar4 = adbiVar;
                    adbiVar4.g.I(3, new acqx(acsb.c(27849)), null);
                    adyu.ca(adbiVar4.a.C(), PairWithTvActivity.class, 1);
                } else if (i3 == 3) {
                    adbi adbiVar5 = adbiVar;
                    adbiVar5.g.I(3, new acqx(acsb.c(27853)), null);
                    adyu.ca(adbiVar5.a.C(), PairWithTvActivity.class, 2);
                } else {
                    adbi adbiVar6 = adbiVar;
                    adbiVar6.g.I(3, new acqx(acsb.c(27852)), null);
                    adbiVar6.a();
                }
            }
        };
        adbiVar.n = inflate.findViewById(R.id.no_tvs_found_title);
        adbiVar.o = (TextView) inflate.findViewById(R.id.no_tvs_found_summary);
        adbiVar.p = (TextView) inflate.findViewById(R.id.no_tvs_found_button);
        adbiVar.p.setOnClickListener(new View.OnClickListener() { // from class: adbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                if (i3 == 0) {
                    adbi adbiVar2 = adbiVar;
                    if (!adbiVar2.u) {
                        adbiVar2.g.I(3, new acqx(acsb.c(27851)), null);
                        adbiVar2.a.C().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                        return;
                    } else {
                        adbiVar2.g.I(3, new acqx(acsb.c(27852)), null);
                        adbiVar2.a();
                        return;
                    }
                }
                if (i3 == 1) {
                    final adbi adbiVar3 = adbiVar;
                    final bpv bpvVar = (bpv) view.getTag();
                    if (!bpvVar.m()) {
                        adbiVar3.g.I(3, new acqx(acsb.c(27847)), null);
                        if (adbiVar3.f.a(false, new adct() { // from class: adbd
                            @Override // defpackage.adct
                            public final void a() {
                                adbi.this.b(bpvVar);
                            }
                        }, "")) {
                            return;
                        }
                        adbiVar3.b(bpvVar);
                        return;
                    }
                    adbiVar3.g.I(3, new acqx(acsb.c(27848)), null);
                    adbiVar3.d.K();
                    return;
                }
                if (i3 == 2) {
                    adbi adbiVar4 = adbiVar;
                    adbiVar4.g.I(3, new acqx(acsb.c(27849)), null);
                    adyu.ca(adbiVar4.a.C(), PairWithTvActivity.class, 1);
                } else if (i3 == 3) {
                    adbi adbiVar5 = adbiVar;
                    adbiVar5.g.I(3, new acqx(acsb.c(27853)), null);
                    adyu.ca(adbiVar5.a.C(), PairWithTvActivity.class, 2);
                } else {
                    adbi adbiVar6 = adbiVar;
                    adbiVar6.g.I(3, new acqx(acsb.c(27852)), null);
                    adbiVar6.a();
                }
            }
        });
        adbiVar.q = inflate.findViewById(R.id.tv_code);
        final int i3 = 2;
        adbiVar.q.setOnClickListener(new View.OnClickListener() { // from class: adbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                if (i32 == 0) {
                    adbi adbiVar2 = adbiVar;
                    if (!adbiVar2.u) {
                        adbiVar2.g.I(3, new acqx(acsb.c(27851)), null);
                        adbiVar2.a.C().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                        return;
                    } else {
                        adbiVar2.g.I(3, new acqx(acsb.c(27852)), null);
                        adbiVar2.a();
                        return;
                    }
                }
                if (i32 == 1) {
                    final adbi adbiVar3 = adbiVar;
                    final bpv bpvVar = (bpv) view.getTag();
                    if (!bpvVar.m()) {
                        adbiVar3.g.I(3, new acqx(acsb.c(27847)), null);
                        if (adbiVar3.f.a(false, new adct() { // from class: adbd
                            @Override // defpackage.adct
                            public final void a() {
                                adbi.this.b(bpvVar);
                            }
                        }, "")) {
                            return;
                        }
                        adbiVar3.b(bpvVar);
                        return;
                    }
                    adbiVar3.g.I(3, new acqx(acsb.c(27848)), null);
                    adbiVar3.d.K();
                    return;
                }
                if (i32 == 2) {
                    adbi adbiVar4 = adbiVar;
                    adbiVar4.g.I(3, new acqx(acsb.c(27849)), null);
                    adyu.ca(adbiVar4.a.C(), PairWithTvActivity.class, 1);
                } else if (i32 == 3) {
                    adbi adbiVar5 = adbiVar;
                    adbiVar5.g.I(3, new acqx(acsb.c(27853)), null);
                    adyu.ca(adbiVar5.a.C(), PairWithTvActivity.class, 2);
                } else {
                    adbi adbiVar6 = adbiVar;
                    adbiVar6.g.I(3, new acqx(acsb.c(27852)), null);
                    adbiVar6.a();
                }
            }
        });
        adbiVar.r = inflate.findViewById(R.id.delete_tv_codes_separator);
        adbiVar.s = inflate.findViewById(R.id.delete_tv_codes_title);
        final int i4 = 3;
        adbiVar.s.setOnClickListener(new View.OnClickListener() { // from class: adbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                if (i32 == 0) {
                    adbi adbiVar2 = adbiVar;
                    if (!adbiVar2.u) {
                        adbiVar2.g.I(3, new acqx(acsb.c(27851)), null);
                        adbiVar2.a.C().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                        return;
                    } else {
                        adbiVar2.g.I(3, new acqx(acsb.c(27852)), null);
                        adbiVar2.a();
                        return;
                    }
                }
                if (i32 == 1) {
                    final adbi adbiVar3 = adbiVar;
                    final bpv bpvVar = (bpv) view.getTag();
                    if (!bpvVar.m()) {
                        adbiVar3.g.I(3, new acqx(acsb.c(27847)), null);
                        if (adbiVar3.f.a(false, new adct() { // from class: adbd
                            @Override // defpackage.adct
                            public final void a() {
                                adbi.this.b(bpvVar);
                            }
                        }, "")) {
                            return;
                        }
                        adbiVar3.b(bpvVar);
                        return;
                    }
                    adbiVar3.g.I(3, new acqx(acsb.c(27848)), null);
                    adbiVar3.d.K();
                    return;
                }
                if (i32 == 2) {
                    adbi adbiVar4 = adbiVar;
                    adbiVar4.g.I(3, new acqx(acsb.c(27849)), null);
                    adyu.ca(adbiVar4.a.C(), PairWithTvActivity.class, 1);
                } else if (i32 == 3) {
                    adbi adbiVar5 = adbiVar;
                    adbiVar5.g.I(3, new acqx(acsb.c(27853)), null);
                    adyu.ca(adbiVar5.a.C(), PairWithTvActivity.class, 2);
                } else {
                    adbi adbiVar6 = adbiVar;
                    adbiVar6.g.I(3, new acqx(acsb.c(27852)), null);
                    adbiVar6.a();
                }
            }
        });
        final int i5 = 4;
        inflate.findViewById(R.id.not_finding_tv_title).setOnClickListener(new View.OnClickListener() { // from class: adbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i5;
                if (i32 == 0) {
                    adbi adbiVar2 = adbiVar;
                    if (!adbiVar2.u) {
                        adbiVar2.g.I(3, new acqx(acsb.c(27851)), null);
                        adbiVar2.a.C().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                        return;
                    } else {
                        adbiVar2.g.I(3, new acqx(acsb.c(27852)), null);
                        adbiVar2.a();
                        return;
                    }
                }
                if (i32 == 1) {
                    final adbi adbiVar3 = adbiVar;
                    final bpv bpvVar = (bpv) view.getTag();
                    if (!bpvVar.m()) {
                        adbiVar3.g.I(3, new acqx(acsb.c(27847)), null);
                        if (adbiVar3.f.a(false, new adct() { // from class: adbd
                            @Override // defpackage.adct
                            public final void a() {
                                adbi.this.b(bpvVar);
                            }
                        }, "")) {
                            return;
                        }
                        adbiVar3.b(bpvVar);
                        return;
                    }
                    adbiVar3.g.I(3, new acqx(acsb.c(27848)), null);
                    adbiVar3.d.K();
                    return;
                }
                if (i32 == 2) {
                    adbi adbiVar4 = adbiVar;
                    adbiVar4.g.I(3, new acqx(acsb.c(27849)), null);
                    adyu.ca(adbiVar4.a.C(), PairWithTvActivity.class, 1);
                } else if (i32 == 3) {
                    adbi adbiVar5 = adbiVar;
                    adbiVar5.g.I(3, new acqx(acsb.c(27853)), null);
                    adyu.ca(adbiVar5.a.C(), PairWithTvActivity.class, 2);
                } else {
                    adbi adbiVar6 = adbiVar;
                    adbiVar6.g.I(3, new acqx(acsb.c(27852)), null);
                    adbiVar6.a();
                }
            }
        });
        adbiVar.g.n(new acqx(acsb.c(27852)));
        return inflate;
    }
}

package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvg extends fuv implements DialogInterface {
    public akht ae;
    private akgp af;
    private akgq ag;

    public final void aH(Bundle bundle) {
        try {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                akgq akgqVar = new akgq();
                if (akgqVar.a == null) {
                    try {
                        avae avaeVar = (avae) aonm.parseFrom(avae.a, bundle2.getByteArray("model"), aomw.b());
                        avaeVar.getClass();
                        akgqVar.a = avaeVar;
                    } catch (aoob unused) {
                        throw new IllegalStateException("SubscriptionNotificationOptionsDialogModel was not able to be built correctly.");
                    }
                }
                if (bundle != null) {
                    akgqVar.e = new HashSet();
                    akgqVar.d = (avai) aonm.parseFrom(avai.a, bundle.getByteArray("primary"), aomw.b());
                    akgqVar.e.addAll(bundle.getStringArrayList("secondary"));
                    akgqVar.b = (avai) aonm.parseFrom(avai.a, bundle.getByteArray("initial_primary"), aomw.b());
                    akgqVar.c = amsx.p(bundle.getStringArrayList("initial_secondary"));
                    if (bundle.containsKey("optimistic_primary")) {
                        akgqVar.f = (avai) aonm.parseFrom(avai.a, bundle.getByteArray("optimistic_primary"), aomw.b());
                    }
                    if (bundle.containsKey("optimistic_secondary")) {
                        akgqVar.g = amsx.p(bundle.getStringArrayList("optimistic_secondary"));
                    }
                }
                for (avai avaiVar : akgqVar.c()) {
                    if (bundle == null && avaiVar.f) {
                        akgqVar.d = avaiVar;
                    }
                }
                if (akgqVar.d != null) {
                    if (akgqVar.e == null) {
                        akgqVar.e = new HashSet();
                    }
                    for (avaj avajVar : akgqVar.d()) {
                        if (bundle == null && avajVar.e == 1) {
                            akgqVar.e.add(avajVar.f);
                        }
                    }
                    if (akgqVar.b == null || bundle == null) {
                        akgqVar.b = akgqVar.d;
                    }
                    if (akgqVar.c == null) {
                        akgqVar.c = amsx.p(akgqVar.e);
                    }
                    this.ag = akgqVar;
                    akgp akgpVar = this.af;
                    if (akgpVar != null) {
                        akgpVar.f = akgqVar;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("SubscriptionNotificationOptionsRenderer does not have a currently selected option.");
            }
            throw new IllegalArgumentException("SubscriptionNotificationOptionsRenderer or Bundle containing renderer not provided.");
        } catch (IllegalArgumentException unused2) {
            dismiss();
        } catch (IllegalStateException unused3) {
            dismiss();
        }
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        akgq akgqVar = this.ag;
        bundle.putByteArray("primary", akgqVar.d.toByteArray());
        bundle.putStringArrayList("secondary", new ArrayList<>(akgqVar.e));
        bundle.putByteArray("initial_primary", akgqVar.b.toByteArray());
        bundle.putStringArrayList("initial_secondary", new ArrayList<>(akgqVar.c));
        avai avaiVar = akgqVar.f;
        if (avaiVar != null) {
            bundle.putByteArray("optimistic_primary", avaiVar.toByteArray());
        }
        Set set = akgqVar.g;
        if (set != null) {
            bundle.putStringArrayList("optimistic_secondary", new ArrayList<>(set));
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        aH(null);
        akgq akgqVar = this.ag;
        if (akgqVar == null) {
            dismiss();
            return;
        }
        akht akhtVar = this.ae;
        Context context = (Context) akhtVar.a.get();
        context.getClass();
        aahd aahdVar = (aahd) akhtVar.b.get();
        aahdVar.getClass();
        ldu lduVar = (ldu) akhtVar.c.get();
        kxh kxhVar = (kxh) akhtVar.e.get();
        ajoy ajoyVar = (ajoy) akhtVar.d.get();
        ajoyVar.getClass();
        this.af = new akgp(context, aahdVar, lduVar, kxhVar, ajoyVar, this, akgqVar, null);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.af.b();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        String str;
        aqyg aqygVar;
        Spanned b;
        aH(bundle);
        AlertDialog.Builder builder = new AlertDialog.Builder(C());
        final akgp akgpVar = this.af;
        if (akgpVar == null) {
            whu.K(C(), R.string.common_error_generic, 0);
            dismiss();
            return builder.create();
        }
        if (akgpVar.f != null) {
            akgpVar.g = LayoutInflater.from(akgpVar.a).inflate(R.layout.subscription_notification_options_fragment, (ViewGroup) null, false);
            ajpa ajpaVar = new ajpa();
            RecyclerView recyclerView = (RecyclerView) akgpVar.g.findViewById(R.id.options_list);
            ajpaVar.f(avai.class, akgpVar.m);
            akgpVar.h = akgpVar.e.a(ajpaVar);
            akgpVar.h.rU(akgpVar.d);
            recyclerView.ac(akgpVar.h);
            recyclerView.af(new akgo());
            akgpVar.i = new ajpd();
            akgpVar.h.h(akgpVar.i);
            akgpVar.k = akgpVar.g.findViewById(R.id.divider);
            akgpVar.l = (RecyclerView) akgpVar.g.findViewById(R.id.secondary_options_list);
            RecyclerView recyclerView2 = akgpVar.l;
            ajpaVar.f(avaj.class, akgpVar.n);
            ajox a = akgpVar.e.a(ajpaVar);
            recyclerView2.ac(a);
            recyclerView2.af(new akgo());
            akgpVar.j = new ajpd();
            a.h(akgpVar.j);
            a.rU(akgpVar.d);
            for (avai avaiVar : akgpVar.f.c()) {
                akgpVar.i.add(avaiVar);
            }
            int i = akgpVar.f.a.d.size() != 0 ? 0 : 8;
            akgpVar.k.setVisibility(i);
            akgpVar.l.setVisibility(i);
            for (avaj avajVar : akgpVar.f.d()) {
                akgpVar.j.add(avajVar);
            }
            View view = akgpVar.g;
            akgq akgqVar = akgpVar.f;
            aott aottVar = akgqVar.a.k;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            if ((aottVar.b & 1) != 0) {
                aott aottVar2 = akgqVar.a.k;
                if (aottVar2 == null) {
                    aottVar2 = aott.a;
                }
                aots aotsVar = aottVar2.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                str = aotsVar.c;
            } else {
                str = null;
            }
            view.setContentDescription(str);
            akgpVar.b();
            builder.setView(akgpVar.g);
            avae avaeVar = akgpVar.f.a;
            if (avaeVar == null) {
                b = null;
            } else {
                if ((avaeVar.b & 8) != 0) {
                    aqygVar = avaeVar.f;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                b = ajcq.b(aqygVar);
            }
            builder.setTitle(b);
            if (akgpVar.f.b() != null) {
                builder.setPositiveButton(akgpVar.f.b(), new DialogInterface.OnClickListener() { // from class: akgm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        akgp akgpVar2 = akgp.this;
                        akgq akgqVar2 = akgpVar2.f;
                        if (!akgqVar2.h ? akgqVar2.b.equals(akgqVar2.d) : akgqVar2.f.equals(akgqVar2.d)) {
                            akgq akgqVar3 = akgpVar2.f;
                            if (!akgqVar3.h) {
                            }
                            akgpVar2.c.dismiss();
                        }
                        akgq akgqVar4 = akgpVar2.f;
                        apxf apxfVar = akgqVar4.d.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aong aongVar = (aong) apxfVar.toBuilder();
                        if (!akgqVar4.d.g) {
                            aone builder2 = ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) aongVar.pX(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint)).toBuilder();
                            builder2.copyOnWrite();
                            ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) builder2.instance).c = aonm.emptyProtobufList();
                            Set set = akgqVar4.e;
                            builder2.copyOnWrite();
                            ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) builder2.instance;
                            aony aonyVar = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c;
                            if (!aonyVar.c()) {
                                modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c = aonm.mutableCopy(aonyVar);
                            }
                            aolo.addAll((Iterable) set, (List) modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c);
                            aongVar.e(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint, (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) builder2.build());
                        }
                        apxf apxfVar2 = (apxf) aongVar.build();
                        if (apxfVar2 != null) {
                            akgpVar2.b.c(apxfVar2, null);
                            akgq akgqVar5 = akgpVar2.f;
                            akgqVar5.h = true;
                            akgqVar5.f = akgqVar5.d;
                            akgqVar5.g = akgqVar5.e;
                        }
                        akgpVar2.c.dismiss();
                    }
                });
            }
            if (akgpVar.f.a() != null) {
                builder.setNegativeButton(akgpVar.f.a(), (DialogInterface.OnClickListener) null);
            }
        }
        return builder.create();
    }
}

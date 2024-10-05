package defpackage;

import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxi {
    public final aild a;
    public final jmq b;
    public final agyr c;
    public final jwl d;
    public final jws e;
    public final acqz f;
    public final jsj g;
    public final Executor h;
    public final Executor i;

    public jxi(aild aildVar, jmq jmqVar, agyr agyrVar, jwl jwlVar, jws jwsVar, acqz acqzVar, jsj jsjVar, Executor executor, Executor executor2) {
        this.a = aildVar;
        this.b = jmqVar;
        this.c = agyrVar;
        this.d = jwlVar;
        this.e = jwsVar;
        this.f = acqzVar;
        this.g = jsjVar;
        this.h = executor;
        this.i = executor2;
    }

    public static atqq a(atre atreVar) {
        try {
            return (atqq) aonm.parseFrom(atqq.a, atreVar.getOfflineStateBytes(), aomw.b());
        } catch (aoob unused) {
            return atqq.a;
        }
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("Failed to check if the video is an Error State using the CompositeDownloadStateChecker.", th);
    }

    public static /* synthetic */ void c(Throwable th) {
        zga.d("Failed to determine the display state of the video using the CompositeDownloadStateChecker.", th);
    }

    public static final Optional e(atqq atqqVar) {
        aqdt aqdtVar;
        if (atqqVar.c != 7) {
            return Optional.empty();
        }
        atqo atqoVar = (atqo) atqqVar.d;
        int i = atqoVar.b;
        if (i == 53345347) {
            return Optional.of((aqkv) atqoVar.c);
        }
        if (i != 64099105) {
            return Optional.empty();
        }
        if (atqoVar.b == 64099105) {
            aqdtVar = (aqdt) atqoVar.c;
        } else {
            aqdtVar = aqdt.a;
        }
        return Optional.of(aqdtVar);
    }

    public final void d(final String str, final jmt jmtVar, final Optional optional, final Optional optional2, final Optional optional3) {
        ynm.k(this.b.a(jmtVar), this.h, jun.g, new ynl() { // from class: jxb
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                anhy b;
                final jxi jxiVar = jxi.this;
                final String str2 = str;
                final jmt jmtVar2 = jmtVar;
                final Optional optional4 = optional;
                final Optional optional5 = optional2;
                final Optional optional6 = optional3;
                final jps jpsVar = (jps) obj;
                if (jpsVar == jps.PLAYABLE) {
                    return;
                }
                amkq.E(jpsVar != jps.PLAYABLE);
                jmq jmqVar = jxiVar.b;
                if (jmtVar2.a() == agnv.class) {
                    b = jmqVar.a.b(jmtVar2);
                } else if (jmtVar2.a() == awil.class) {
                    b = jmqVar.b.b(jmtVar2);
                } else if (jmtVar2.a() == asxs.class) {
                    b = jmqVar.c.b(jmtVar2);
                } else {
                    String valueOf = String.valueOf(jmtVar2.a());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                    sb.append("CompositeDownloadStateChecker.isDownloadInErrorStateAsync does not have support for ");
                    sb.append(valueOf);
                    throw new UnsupportedOperationException(sb.toString());
                }
                ynm.k(anfq.i(anht.q(b), new anfz() { // from class: jxd
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        anhy c;
                        jxi jxiVar2 = jxi.this;
                        jmt jmtVar3 = jmtVar2;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        jmq jmqVar2 = jxiVar2.b;
                        if (jmtVar3.a() == agnv.class) {
                            c = jmqVar2.a.c(jmtVar3);
                        } else if (jmtVar3.a() == awil.class) {
                            c = jmqVar2.b.c(jmtVar3);
                        } else if (jmtVar3.a() == asxs.class) {
                            c = jmqVar2.c.c(jmtVar3);
                        } else {
                            String valueOf2 = String.valueOf(jmtVar3.a());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 81);
                            sb2.append("CompositeDownloadStateChecker.isDownloadRetryableAsync does not have support for ");
                            sb2.append(valueOf2);
                            throw new UnsupportedOperationException(sb2.toString());
                        }
                        return anfq.h(anht.q(c), new eou(booleanValue, 8), jxiVar2.i);
                    }
                }, jxiVar.i), jxiVar.h, jun.f, new ynl() { // from class: jxc
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        final jxi jxiVar2 = jxi.this;
                        final String str3 = str2;
                        Optional optional7 = optional4;
                        Optional optional8 = optional5;
                        Optional optional9 = optional6;
                        jps jpsVar2 = jpsVar;
                        jxh jxhVar = (jxh) obj2;
                        if (jxhVar.a) {
                            boolean z = jxhVar.b;
                            if (jpsVar2 != jps.TRANSFER_PENDING_USER_APPROVAL || !optional9.isPresent() || ((String) optional9.get()).isEmpty()) {
                                if (jpsVar2 == jps.ERROR_PENDING_PLAYABILITY_ACTION) {
                                    if (optional7.isPresent()) {
                                        aryr aryrVar = (aryr) aarr.c(((atxb) optional7.get()).getPlayerResponseBytes().I(), aryr.a);
                                        if (aryrVar == null) {
                                            aryrVar = aryr.a;
                                        }
                                        aild aildVar = jxiVar2.a;
                                        aryi aryiVar = aryrVar.f;
                                        if (aryiVar == null) {
                                            aryiVar = aryi.a;
                                        }
                                        aildVar.k(aryiVar, new jxg(jxiVar2.d, str3, (String) optional9.orElse(null)), str3);
                                        return;
                                    }
                                    return;
                                }
                                if (jpsVar2 == jps.ERROR_STREAMS_MISSING) {
                                    jxiVar2.d.t((String) optional9.orElse(null), str3);
                                    return;
                                }
                                if (jpsVar2 == jps.ERROR_EXPIRED) {
                                    if (optional8.isPresent()) {
                                        final atqq a = jxi.a((atre) optional8.get());
                                        jxi.e(a).ifPresent(new Consumer() { // from class: jxe
                                            @Override // j$.util.function.Consumer
                                            public final void accept(Object obj3) {
                                                jxi jxiVar3 = jxi.this;
                                                atqq atqqVar = a;
                                                jwl jwlVar = jxiVar3.d;
                                                jwlVar.a.a(ammv.j(obj3), Long.valueOf(atqqVar.g), new jwk(jwlVar, 0));
                                            }

                                            @Override // j$.util.function.Consumer
                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer.CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if (jpsVar2 == jps.ERROR_POLICY || jpsVar2 == jps.ERROR_NOT_PLAYABLE) {
                                    jsj jsjVar = jxiVar2.g;
                                    if (optional8.isPresent()) {
                                        try {
                                            if (jsj.a((atqq) aonm.parseFrom(atqq.a, ((atre) optional8.get()).getOfflineStateBytes(), aomw.b()))) {
                                                jsjVar.a.c(2);
                                            }
                                        } catch (aoob unused) {
                                            zga.b("Could not parse the OfflineState from the OfflineVideoPolicyEntity to determine if an offline refresh should be scheduled");
                                        }
                                    }
                                    if (optional8.isPresent()) {
                                        jxi.e(jxi.a((atre) optional8.get())).ifPresent(new Consumer() { // from class: jxf
                                            @Override // j$.util.function.Consumer
                                            public final void accept(Object obj3) {
                                                jxi jxiVar3 = jxi.this;
                                                jxiVar3.d.q(str3, obj3, jxiVar3.f.mM());
                                            }

                                            @Override // j$.util.function.Consumer
                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer.CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if (jpsVar2 == jps.ERROR_EXPIRED_RENTAL) {
                                    jxiVar2.d.c(str3, true);
                                    return;
                                } else if (z) {
                                    jxiVar2.d.m((String) optional9.orElse(null), str3, null, true);
                                    return;
                                } else {
                                    jxiVar2.d.c(str3, true);
                                    return;
                                }
                            }
                            jxiVar2.c.f((String) optional9.get(), agyg.a(true));
                            return;
                        }
                        if (jpsVar2 == jps.TRANSFER_IN_PROGRESS || jpsVar2 == jps.TRANSFER_PAUSED || jpsVar2 == jps.TRANSFER_WAITING_IN_QUEUE) {
                            jxiVar2.e.d(R.string.offline_click_queued_offline_video_snackbar_text);
                            acrb acrbVar = acrb.OFFLINE_VIDEO_NOT_DOWNLOADED_YET;
                            acra mM = jxiVar2.f.mM();
                            if (mM == null) {
                                zga.b("No valid interaction logger.");
                            } else {
                                mM.n(new acqx(acrbVar));
                            }
                        }
                    }
                });
            }
        });
    }
}

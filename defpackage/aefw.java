package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefw {
    public final atr a;
    public final aefv b;
    public final aels c;
    private final ScheduledExecutorService d;
    private Future e;

    public aefw(atr atrVar, ScheduledExecutorService scheduledExecutorService, aels aelsVar) {
        afki.a(atrVar);
        this.a = atrVar;
        afki.a(scheduledExecutorService);
        this.d = scheduledExecutorService;
        afki.a(aelsVar);
        this.c = aelsVar;
        this.b = new aefv(new aefu() { // from class: aefr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.aefu
            public final void a(int i, int i2, ByteBuffer byteBuffer) {
                aels aelsVar2 = aefw.this.c;
                try {
                    aelr aelrVar = aelsVar2.c;
                    if (aelrVar.e == null) {
                        ovx a = ovx.a(i);
                        if (a == null) {
                            aelrVar.b = ovx.UNKNOWN;
                            aeln aelnVar = aelrVar.a;
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("OnesieMultipartWrapper: Unknown part type: ");
                            sb.append(i);
                            aelnVar.i(new aelo(109, sb.toString()));
                            return;
                        }
                        aelrVar.b = a;
                        if (aelrVar.b != ovx.MEDIA && aelrVar.b != ovx.ONESIE_ENCRYPTED_MEDIA && aelrVar.b != ovx.MEDIA_END) {
                            aelrVar.e = ByteBuffer.allocate(byteBuffer.remaining() + i2);
                            aelrVar.d = ByteBuffer.allocate(0);
                        }
                        if (byteBuffer.remaining() > 0) {
                            int a2 = aedn.a(byteBuffer.get(byteBuffer.position()));
                            aelrVar.e = ByteBuffer.allocate((byteBuffer.remaining() + i2) - a2);
                            aelrVar.d = ByteBuffer.allocate(a2);
                        } else {
                            aelrVar.e = ByteBuffer.allocate(0);
                            aelrVar.d = ByteBuffer.allocate(0);
                        }
                    }
                    aelr.a(byteBuffer, aelrVar.d);
                    aelr.a(byteBuffer, aelrVar.e);
                    if (i2 == 0) {
                        if (aelrVar.c != null && aelrVar.b != ovx.ONESIE_DATA) {
                            aelrVar.d(aelrVar.c);
                        }
                        try {
                            ByteBuffer byteBuffer2 = aelrVar.e;
                            if (byteBuffer2 == null) {
                                aelrVar.a.i(new aelo(110, "OnesieMultipartWrapper: Part completed with no data present."));
                                return;
                            }
                            ovx ovxVar = ovx.UNKNOWN;
                            switch (aelrVar.b.ordinal()) {
                                case 1:
                                    aelrVar.c = (ovr) ((aone) ovr.a.createBuilder().mergeFrom(byteBuffer2.array(), aomw.b())).build();
                                    break;
                                case 2:
                                    ovr ovrVar = aelrVar.c;
                                    if (ovrVar != null) {
                                        aelrVar.c(ovrVar, byteBuffer2.array());
                                        break;
                                    } else {
                                        aelrVar.a.i(new aelo(110, "OnesieMultipartWrapper: OnesieData present without succeeding OnesieHeader"));
                                        break;
                                    }
                                case 3:
                                case 5:
                                case 6:
                                    ByteBuffer byteBuffer3 = aelrVar.d;
                                    if (byteBuffer3 != null) {
                                        Integer b = aedn.b(byteBuffer3);
                                        String str = "MEDIA";
                                        if (b == null) {
                                            Object[] objArr = new Object[1];
                                            if (aelrVar.b == ovx.ONESIE_ENCRYPTED_MEDIA) {
                                                str = "ONESIE_ENCRYPTED_MEDIA";
                                            } else if (aelrVar.b != ovx.MEDIA) {
                                                str = "MEDIA_END";
                                            }
                                            objArr[0] = str;
                                            throw new aelo(111, String.format("UMP part %s with missing embedded header id", objArr));
                                        }
                                        if (aelrVar.f.containsKey(b) && aelrVar.g.containsKey(b)) {
                                            if (aelrVar.b != ovx.MEDIA_END) {
                                                if (aelrVar.b == ovx.ONESIE_ENCRYPTED_MEDIA) {
                                                    aelrVar.b(byteBuffer2.array(), b, false, true);
                                                    break;
                                                } else {
                                                    aelrVar.b(byteBuffer2.array(), b, false, false);
                                                    break;
                                                }
                                            } else {
                                                aelrVar.b(new byte[0], b, true, false);
                                                break;
                                            }
                                        }
                                        aeln aelnVar2 = aelrVar.a;
                                        Object[] objArr2 = new Object[1];
                                        if (aelrVar.b == ovx.ONESIE_ENCRYPTED_MEDIA) {
                                            str = "ONESIE_ENCRYPTED_MEDIA";
                                        } else if (aelrVar.b != ovx.MEDIA) {
                                            str = "MEDIA_END";
                                        }
                                        objArr2[0] = str;
                                        aelnVar2.i(new aelo(111, String.format("OnesieMultipartWrapper UMP part %s passed with unseen header id", objArr2)));
                                        break;
                                    } else {
                                        throw new aelo(111, String.format("UMP part %s with null header id", aelrVar.b.name()));
                                    }
                                    break;
                                case 4:
                                    ovo ovoVar = (ovo) aonm.parseFrom(ovo.a, byteBuffer2.array());
                                    if ((ovoVar.b & 1) != 0) {
                                        aelrVar.f.put(Integer.valueOf(ovoVar.c), ovoVar);
                                        aelrVar.g.put(Integer.valueOf(ovoVar.c), Long.valueOf((ovoVar.b & 32) != 0 ? ovoVar.h : 0L));
                                        break;
                                    } else {
                                        aelrVar.a.i(new aelo(111, "OnesieMultipartWrapper: MediaHeader does not contain HeaderId"));
                                        break;
                                    }
                                case 7:
                                    break;
                                case 8:
                                    ovu ovuVar = (ovu) aonm.parseFrom(ovu.a, byteBuffer2.array(), aomw.b());
                                    aeln aelnVar3 = aelrVar.a;
                                    ((aeis) aelnVar3).g(ovuVar.c);
                                    ((aeis) aelnVar3).a.e(ovuVar);
                                    break;
                                case 9:
                                    ovj ovjVar = (ovj) aonm.parseFrom(ovj.a, byteBuffer2.array(), aomw.b());
                                    aeln aelnVar4 = aelrVar.a;
                                    ((aeis) aelnVar4).g(ovjVar.d);
                                    ((aeis) aelnVar4).a.d(ovjVar);
                                    break;
                                case 10:
                                    ovt ovtVar = (ovt) aonm.parseFrom(ovt.a, byteBuffer2.array(), aomw.b());
                                    aeln aelnVar5 = aelrVar.a;
                                    ((aeis) aelnVar5).g(ovtVar.b);
                                    ((aeis) aelnVar5).a.f(ovtVar);
                                    break;
                                case 11:
                                    ((aeis) aelrVar.a).a.r();
                                    break;
                                case 13:
                                    ovi oviVar = (ovi) aonm.parseFrom(ovi.a, byteBuffer2.array(), aomw.b());
                                    aelrVar.a.f(oviVar.d, amsx.p(oviVar.c));
                                    break;
                            }
                            if (aelrVar.b != ovx.ONESIE_HEADER) {
                                aelrVar.c = null;
                            }
                            aelrVar.e = null;
                        } finally {
                            if (aelrVar.b != ovx.ONESIE_HEADER) {
                                aelrVar.c = null;
                            }
                            aelrVar.e = null;
                        }
                    }
                } catch (aelo | aoob e) {
                    aelsVar2.b.e(e);
                }
            }
        });
    }

    public final synchronized void a() {
        Future future = this.e;
        if (future != null) {
            future.cancel(true);
            this.e = null;
        }
    }

    public final synchronized void b(ath athVar) {
        if (this.e == null) {
            this.e = this.d.submit(new aeft(this, athVar));
        }
    }

    public static boolean c(Map map) {
        if (map == null) {
            throw new aefs(3, "Response headers missing");
        }
        List list = (List) map.get("Content-Type");
        if (list == null) {
            throw new aefs(3, "Content-Type header missing");
        }
        return ((String) list.get(0)).contains("application/vnd.yt-ump");
    }
}

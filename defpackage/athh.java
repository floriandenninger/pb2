package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athh extends aonm implements aooz {
    public static final athh a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        athh athhVar = new athh();
        a = athhVar;
        aonm.registerDefaultInstance(athh.class, athhVar);
    }

    private athh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000ﻼ⨻ﯥ鴪\u0005\u0000\u0000\u0005ﻼ⨻ᐼ\u0000\ue1ce㩂ᐼ\u0000\uf5b1玨ᐼ\u0000\ue504覴ᐼ\u0000ﯥ鴪ᐼ\u0000", new Object[]{"c", "b", asvf.class, athm.class, aufj.class, appc.class, aqwz.class});
            case NEW_MUTABLE_INSTANCE:
                return new athh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (athh.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

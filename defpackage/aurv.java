package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurv extends aonm implements aooz {
    public static final aurv a;
    private static volatile aopf e;
    public int b;
    public aurt c;
    public auru d;
    private byte f = 2;

    static {
        aurv aurvVar = new aurv();
        a = aurvVar;
        aonm.registerDefaultInstance(aurv.class, aurvVar);
    }

    private aurv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱎ␈\uf629⧧\u0002\u0000\u0000\u0002ﱎ␈ᐉ\u0000\uf629⧧ᐉ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aurv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aurv.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

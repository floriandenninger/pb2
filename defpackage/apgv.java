package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apgv extends aonm implements aooz {
    public static final apgv a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public aulq d;
    public int e;
    private byte g = 2;

    static {
        apgv apgvVar = new apgv();
        a = apgvVar;
        aonm.registerDefaultInstance(apgv.class, apgvVar);
    }

    private apgv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", apew.j});
            case NEW_MUTABLE_INSTANCE:
                return new apgv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apgv.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

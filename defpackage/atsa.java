package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsa extends aonm implements aooz {
    public static final atsa a;
    private static volatile aopf e;
    public int b;
    public aqkv c;
    public avul d;
    private aqdt f;
    private byte g = 2;

    static {
        atsa atsaVar = new atsa();
        a = atsaVar;
        aonm.registerDefaultInstance(atsa.class, atsaVar);
    }

    private atsa() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001ﱃ\u196f\ue607⨅\u0003\u0000\u0000\u0003ﱃ\u196fᐉ\u0000\uf321Ẑᐉ\u0002\ue607⨅ᐉ\u0001", new Object[]{"b", "c", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atsa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atsa.class) {
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

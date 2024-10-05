package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avnt extends aonm implements aooz {
    public static final avnt a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aulq f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aota j;
    private byte k = 2;

    static {
        avnt avntVar = new avnt();
        a = avntVar;
        aonm.registerDefaultInstance(avnt.class, avntVar);
    }

    private avnt() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0005\u0006ᐉ\t\u0007ᐉ\u0004\bᐉ\u0003\tᐉ\u0001", new Object[]{"c", "d", "f", "i", "j", "h", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avnt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avnt.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avoo extends aonm implements aooz {
    public static final avoo a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aulq f;
    private aulq g;
    private aota h;
    private aulq i;
    private byte j = 2;

    static {
        avoo avooVar = new avoo();
        a = avooVar;
        aonm.registerDefaultInstance(avoo.class, avooVar);
    }

    private avoo() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0003\u0003ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0007", new Object[]{"c", "f", "g", "h", "d", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avoo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avoo.class) {
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

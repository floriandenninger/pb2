package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auxq extends aonm implements aooz {
    public static final auxq a;
    private static volatile aopf i;
    public int b;
    public avgg c;
    public auxp d;
    public aqyg e;
    public apxf f;
    private aota j;
    private byte k = 2;
    public aony g = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        auxq auxqVar = new auxq();
        a = auxqVar;
        aonm.registerDefaultInstance(auxq.class, auxqVar);
    }

    private auxq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ည\u0006\bЛ", new Object[]{"b", "c", "d", "e", "f", "j", "h", "g", avfv.class});
            case NEW_MUTABLE_INSTANCE:
                return new auxq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auxq.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

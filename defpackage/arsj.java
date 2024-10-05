package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsj extends aonm implements aooz {
    public static final arsj a;
    private static volatile aopf f;
    public int b;
    public arnb c;
    public avwv d;
    private byte g = 2;
    public aonu e = emptyIntList();

    static {
        arsj arsjVar = new arsj();
        a = arsjVar;
        aonm.registerDefaultInstance(arsj.class, arsjVar);
    }

    private arsj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003\u001e", new Object[]{"b", "c", "d", "e", avya.k});
            case NEW_MUTABLE_INSTANCE:
                return new arsj();
            case NEW_BUILDER:
                return new aone((char[][]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arsj.class) {
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

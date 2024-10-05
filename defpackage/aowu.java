package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowu extends aonm implements aooz {
    public static final aowu a;
    private static volatile aopf e;
    public int b;
    public avgg c;
    public aowv d;
    private aota f;
    private byte g = 2;

    static {
        aowu aowuVar = new aowu();
        a = aowuVar;
        aonm.registerDefaultInstance(aowu.class, aowuVar);
    }

    private aowu() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aowu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aowu.class) {
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

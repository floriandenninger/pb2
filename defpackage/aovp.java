package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aovp extends aonm implements aooz {
    public static final aonv a = new uct(6);
    public static final aovp b;
    private static volatile aopf e;
    public boolean c;
    private int f;
    private apxf g;
    private byte h = 2;
    public aonu d = emptyIntList();

    static {
        aovp aovpVar = new aovp();
        b = aovpVar;
        aonm.registerDefaultInstance(aovp.class, aovpVar);
    }

    private aovp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ဇ\u0000\u0003ᐉ\u0003\u0005\u001e", new Object[]{"f", "c", "g", "d", aovo.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aovp();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aovp.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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

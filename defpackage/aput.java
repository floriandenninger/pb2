package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aput extends aonm implements aooz {
    public static final aput a;
    private static volatile aopf h;
    public int b;
    public boolean d;
    public apuy e;
    public boolean f;
    public apuu g;
    private byte i = 2;
    public String c = "";

    static {
        aput aputVar = new aput();
        a = aputVar;
        aonm.registerDefaultInstance(aput.class, aputVar);
    }

    private aput() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aput();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aput.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

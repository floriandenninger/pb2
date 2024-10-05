package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnc extends aonm implements aooz {
    public static final arnc a;
    private static volatile aopf e;
    public int b;
    public boolean c;
    public aony d;
    private andq f;
    private aori g;
    private andq h;
    private byte i = 2;

    static {
        arnc arncVar = new arnc();
        a = arncVar;
        aonm.registerDefaultInstance(arnc.class, arncVar);
    }

    private arnc() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0005\u001a\u0005\u0000\u0001\u0003\u0005ᐉ\u0000\u000bᐉ\u0007\u000eဇ\r\u0011ᐉ\u000f\u001a\u001b", new Object[]{"b", "f", "g", "c", "h", "d", aqek.class});
            case NEW_MUTABLE_INSTANCE:
                return new arnc();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arnc.class) {
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

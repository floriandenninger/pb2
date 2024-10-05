package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpq extends aonm implements aooz {
    public static final atpq a;
    private static volatile aopf h;
    public int b;
    public int c;
    public atpo e;
    private byte i = 2;
    public String d = "";
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        atpq atpqVar = new atpq();
        a = atpqVar;
        aonm.registerDefaultInstance(atpq.class, atpqVar);
    }

    private atpq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001ဌ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", atnn.o, "d", "e", "f", atpq.class, "g", atpq.class});
            case NEW_MUTABLE_INSTANCE:
                return new atpq();
            case NEW_BUILDER:
                return new aone((int[]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atpq.class) {
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

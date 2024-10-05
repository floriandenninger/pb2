package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfi extends aonm implements aooz {
    public static final apfi a;
    private static volatile aopf h;
    public int b;
    public apxf e;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        apfi apfiVar = new apfi();
        a = apfiVar;
        aonm.registerDefaultInstance(apfi.class, apfiVar);
    }

    private apfi() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\u0005Л\u0006Л", new Object[]{"b", "c", "d", "e", "f", apxf.class, "g", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new apfi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apfi.class) {
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

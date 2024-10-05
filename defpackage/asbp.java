package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbp extends aonm implements aooz {
    public static final asbp a;
    private static volatile aopf j;
    public int b;
    public arnd c;
    public asbn f;
    public arwh g;
    public long i;
    private aota k;
    private aqzg l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        asbp asbpVar = new asbp();
        a = asbpVar;
        aonm.registerDefaultInstance(asbp.class, asbpVar);
    }

    private asbp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0002\u0006\u0001ᐉ\u0000\u0003\u001b\u0005Л\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0003\tည\u0004\nဂ\u0005̉ᐉ\u0006", new Object[]{"b", "c", "d", asus.class, "e", apxf.class, "f", "g", "k", "h", "i", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asbp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asbp.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

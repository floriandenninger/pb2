package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class artl extends aonm implements aooz {
    public static final artl a;
    private static volatile aopf f;
    public int b;
    public arnb c;
    private byte g = 2;
    public aony d = emptyProtobufList();
    public String e = "";

    static {
        artl artlVar = new artl();
        a = artlVar;
        aonm.registerDefaultInstance(artl.class, artlVar);
    }

    private artl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0004ဈ\u0001", new Object[]{"b", "c", "d", artp.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new artl();
            case NEW_BUILDER:
                return new aone((char[]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (artl.class) {
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

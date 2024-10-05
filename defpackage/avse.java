package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avse extends aonm implements aooz {
    public static final avse a;
    private static volatile aopf g;
    public int b;
    public arnb c;
    private byte h = 2;
    public String d = "";
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();

    static {
        avse avseVar = new avse();
        a = avseVar;
        aonm.registerDefaultInstance(avse.class, avseVar);
    }

    private avse() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", "e", aurp.class, "f", aurp.class});
            case NEW_MUTABLE_INSTANCE:
                return new avse();
            case NEW_BUILDER:
                return new aone((short[]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avse.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armk extends aonm implements aooz {
    public static final armk a;
    private static volatile aopf g;
    public int b;
    public arnb c;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public aony f = emptyProtobufList();

    static {
        armk armkVar = new armk();
        a = armkVar;
        aonm.registerDefaultInstance(armk.class, armkVar);
    }

    private armk() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0004ဈ\u0001\u0005\u001c", new Object[]{"b", "c", "e", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new armk();
            case NEW_BUILDER:
                return new aone((int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (armk.class) {
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

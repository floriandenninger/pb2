package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appp extends aonm implements aooz {
    public static final appp a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public aqyg f;
    public aqyg j;
    private byte l = 2;
    public String d = "";
    public boolean e = true;
    public String g = "";
    public boolean h = true;
    public aony i = emptyProtobufList();

    static {
        appp apppVar = new appp();
        a = apppVar;
        aonm.registerDefaultInstance(appp.class, apppVar);
    }

    private appp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0004\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ᐉ\u0005\u0007ဈ\u0006\bဇ\u0007\nЛ\u000bᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aqyg.class, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new appp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (appp.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

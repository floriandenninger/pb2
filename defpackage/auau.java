package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auau extends aonm implements aooz {
    public static final auau a;
    private static volatile aopf m;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public int j;
    public String k;
    public boolean l;

    static {
        auau auauVar = new auau();
        a = auauVar;
        aonm.registerDefaultInstance(auau.class, auauVar);
    }

    private auau() {
        aomf aomfVar = aomf.b;
        this.k = "";
        emptyProtobufList();
        emptyIntList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u001e\n\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0005ဈ\u0006\u0006ဌ\u0000\nဈ\b\u000bဈ\t\rဌ\u000b\u0011ဈ\u000f\u001dဇ\u0016\u001eဈ\u0005", new Object[]{"b", "d", "e", "g", "c", atxj.m, "h", "i", "j", aufb.d, "k", "l", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auau();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (auau.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

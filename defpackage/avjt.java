package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjt extends aonm implements aooz {
    public static final avjt a;
    public static final aonk b;
    private static volatile aopf p;
    public int c;
    public int e;
    public int g;
    public long j;
    public int k;
    public int n;
    public boolean o;
    public String d = "";
    public aony f = emptyProtobufList();
    public aony h = aonm.emptyProtobufList();
    public String i = "";
    public String l = "";
    public aony m = aonm.emptyProtobufList();

    static {
        avjt avjtVar = new avjt();
        a = avjtVar;
        aonm.registerDefaultInstance(avjt.class, avjtVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, avjtVar, avjtVar, null, 120, aoqn.MESSAGE, avjt.class);
    }

    private avjt() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဌ\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဂ\u0004\bဌ\u0005\tဈ\u0006\n\u001a\u000bင\u0007\fဇ\b", new Object[]{"c", "d", "e", avjo.a(), "f", auyr.class, "g", avjp.a(), "h", "i", "j", "k", atrx.a(), "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new avjt();
            case NEW_BUILDER:
                return new aone((char[][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (avjt.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

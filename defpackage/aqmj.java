package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmj extends aonm implements aooz {
    public static final aqmj a;
    public static final aonk b;
    private static volatile aopf o;
    public int c;
    public int e;
    public float f;
    public float g;
    public boolean i;
    public boolean j;
    public boolean k;
    public atpg l;
    public long m;
    public atpf n;
    public String d = "";
    public String h = "";

    static {
        aqmj aqmjVar = new aqmj();
        a = aqmjVar;
        aonm.registerDefaultInstance(aqmj.class, aqmjVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqmjVar, aqmjVar, null, 141, aoqn.MESSAGE, aqmj.class);
    }

    private aqmj() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ဈ\u0004\u0005ခ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\tဇ\u0007\nဉ\b\u000bဂ\t\fဉ\n", new Object[]{"c", "d", "e", avxt.a(), "f", "h", "g", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqmj.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

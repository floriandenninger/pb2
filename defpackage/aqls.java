package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqls extends aonm implements aooz {
    public static final aqls a;
    private static volatile aopf o;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public awnw k;
    public boolean m;
    public int c = 0;
    public int e = 0;
    private byte p = 2;
    public String h = "";
    public String i = "";
    public String j = "";
    public aony l = emptyProtobufList();
    public String n = "";

    static {
        aqls aqlsVar = new aqls();
        a = aqlsVar;
        aonm.registerDefaultInstance(aqls.class, aqlsVar);
    }

    private aqls() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0002\u0001\u0001\f\f\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ျ\u0000\u0007ျ\u0000\bွ\u0001\t့\u0001\n\u001b\u000bဇ\t\fဈ\n", new Object[]{"d", "c", "f", "e", "b", "g", aqkw.d, "h", "i", "j", "k", "l", aqll.class, "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqls();
            case NEW_BUILDER:
                return new aone((int[]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqls.class) {
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

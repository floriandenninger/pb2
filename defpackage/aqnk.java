package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnk extends aonm implements aooz {
    public static final aqnk a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public boolean d;
    private byte j = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        aqnk aqnkVar = new aqnk();
        a = aqnkVar;
        aonm.registerDefaultInstance(aqnk.class, aqnkVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqnkVar, aqnkVar, null, 355044355, aoqn.MESSAGE, aqnk.class);
    }

    private aqnk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqnk.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aonm extends aolo {
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    public aoqc unknownFields = aoqc.a;
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static aonk checkIsLite(aomu aomuVar) {
        return (aonk) aomuVar;
    }

    private static aonm checkMessageInitialized(aonm aonmVar) {
        if (aonmVar == null || aonmVar.isInitialized()) {
            return aonmVar;
        }
        throw aonmVar.newUninitializedMessageException().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aono emptyBooleanList() {
        return aolw.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aonp emptyDoubleList() {
        return aomr.b;
    }

    public static aont emptyFloatList() {
        return aonc.b;
    }

    public static aonu emptyIntList() {
        return aonn.b;
    }

    public static aonx emptyLongList() {
        return aoon.b;
    }

    public static aony emptyProtobufList() {
        return aopj.b;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == aoqc.a) {
            this.unknownFields = aoqc.c();
        }
    }

    protected static aomy fieldInfo(Field field, int i, aonb aonbVar) {
        return fieldInfo(field, i, aonbVar, false);
    }

    protected static aomy fieldInfoForMap(Field field, int i, Object obj, aons aonsVar) {
        if (field == null) {
            return null;
        }
        aonz.i(obj, "mapDefaultEntry");
        aomy.b(i);
        aonz.i(field, "field");
        return new aomy(field, i, aonb.MAP, null, null, 0, false, true, null, null, obj, aonsVar);
    }

    protected static aomy fieldInfoForOneofEnum(int i, Object obj, Class cls, aons aonsVar) {
        if (obj == null) {
            return null;
        }
        return aomy.a(i, aonb.ENUM, (aope) obj, cls, false, aonsVar);
    }

    protected static aomy fieldInfoForOneofMessage(int i, aonb aonbVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return aomy.a(i, aonbVar, (aope) obj, cls, false, null);
    }

    protected static aomy fieldInfoForOneofPrimitive(int i, aonb aonbVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return aomy.a(i, aonbVar, (aope) obj, cls, false, null);
    }

    protected static aomy fieldInfoForOneofString(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        return aomy.a(i, aonb.STRING, (aope) obj, String.class, z, null);
    }

    public static aomy fieldInfoForProto2Optional(Field field, int i, aonb aonbVar, Field field2, int i2, boolean z, aons aonsVar) {
        if (field == null || field2 == null) {
            return null;
        }
        aomy.b(i);
        aonz.i(field, "field");
        aonz.i(aonbVar, "fieldType");
        aonz.i(field2, "presenceField");
        if (aomy.c(i2)) {
            return new aomy(field, i, aonbVar, null, field2, i2, false, z, null, null, null, aonsVar);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static aomy fieldInfoForProto2Required(Field field, int i, aonb aonbVar, Field field2, int i2, boolean z, aons aonsVar) {
        if (field == null || field2 == null) {
            return null;
        }
        aomy.b(i);
        aonz.i(field, "field");
        aonz.i(aonbVar, "fieldType");
        aonz.i(field2, "presenceField");
        if (aomy.c(i2)) {
            return new aomy(field, i, aonbVar, null, field2, i2, true, z, null, null, null, aonsVar);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    protected static aomy fieldInfoForRepeatedMessage(Field field, int i, aonb aonbVar, Class cls) {
        if (field == null) {
            return null;
        }
        aomy.b(i);
        aonz.i(field, "field");
        aonz.i(aonbVar, "fieldType");
        aonz.i(cls, "messageClass");
        return new aomy(field, i, aonbVar, cls, null, 0, false, false, null, null, null, null);
    }

    protected static aomy fieldInfoWithEnumVerifier(Field field, int i, aonb aonbVar, aons aonsVar) {
        if (field == null) {
            return null;
        }
        aomy.b(i);
        aonz.i(field, "field");
        return new aomy(field, i, aonbVar, null, null, 0, false, false, null, null, null, aonsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aonm getDefaultInstance(Class cls) {
        aonm aonmVar = (aonm) defaultInstanceMap.get(cls);
        if (aonmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                aonmVar = (aonm) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (aonmVar == null) {
            aonmVar = ((aonm) aoqk.h(cls)).getDefaultInstanceForType();
            if (aonmVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, aonmVar);
        }
        return aonmVar;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 45 + String.valueOf(str).length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object[] newFieldInfoArray(int i) {
        return new aomy[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object newMessageInfo(aooy aooyVar, String str, Object[] objArr) {
        return new aopk(aooyVar, str, objArr);
    }

    protected static aoov newMessageInfoForMessageSet(aoph aophVar, int[] iArr, Object[] objArr, Object obj) {
        return new aopz(aophVar, true, iArr, (aomy[]) objArr, obj);
    }

    protected static aope newOneofInfo(int i, Field field, Field field2) {
        if (field == null || field2 == null) {
            return null;
        }
        return new aope(field, field2);
    }

    public static aonk newRepeatedGeneratedExtension(aooy aooyVar, aooy aooyVar2, aonr aonrVar, int i, aoqn aoqnVar, boolean z, Class cls) {
        return new aonk(aooyVar, Collections.emptyList(), aooyVar2, new aonj(aonrVar, i, aoqnVar, true, z));
    }

    public static aonk newSingularGeneratedExtension(aooy aooyVar, Object obj, aooy aooyVar2, aonr aonrVar, int i, aoqn aoqnVar, Class cls) {
        return new aonk(aooyVar, obj, aooyVar2, new aonj(aonrVar, i, aoqnVar, false, false));
    }

    public static aonm parseDelimitedFrom(aonm aonmVar, InputStream inputStream) {
        aonm parsePartialDelimitedFrom = parsePartialDelimitedFrom(aonmVar, inputStream, aomw.a());
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    public static aonm parseFrom(aonm aonmVar, aomf aomfVar) {
        aonm parseFrom = parseFrom(aonmVar, aomfVar, aomw.a());
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    private static aonm parsePartialDelimitedFrom(aonm aonmVar, InputStream inputStream, aomw aomwVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            aomk M = aomk.M(new aolm(inputStream, aomk.K(read, inputStream)));
            aonm parsePartialFrom = parsePartialFrom(aonmVar, M, aomwVar);
            try {
                M.B(0);
                return parsePartialFrom;
            } catch (aoob e) {
                throw e;
            }
        } catch (aoob e2) {
            if (e2.a) {
                throw new aoob(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new aoob(e3);
        }
    }

    private static aonm parsePartialFrom(aonm aonmVar, aomf aomfVar, aomw aomwVar) {
        try {
            aomk l = aomfVar.l();
            aonm parsePartialFrom = parsePartialFrom(aonmVar, l, aomwVar);
            try {
                l.B(0);
                return parsePartialFrom;
            } catch (aoob e) {
                throw e;
            }
        } catch (aoob e2) {
            throw e2;
        }
    }

    protected static Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void registerDefaultInstance(Class cls, aonm aonmVar) {
        defaultInstanceMap.put(cls, aonmVar);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(aonl.BUILD_MESSAGE_INFO);
    }

    public final aone createBuilder() {
        return (aone) dynamicMethod(aonl.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object dynamicMethod(aonl aonlVar) {
        return dynamicMethod(aonlVar, null, null);
    }

    protected abstract Object dynamicMethod(aonl aonlVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return aopi.a.b(this).j(this, (aonm) obj);
        }
        return false;
    }

    @Override // defpackage.aooz
    public final aonm getDefaultInstanceForType() {
        return (aonm) dynamicMethod(aonl.GET_DEFAULT_INSTANCE);
    }

    @Override // defpackage.aolo
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.aooy
    public final aopf getParserForType() {
        return (aopf) dynamicMethod(aonl.GET_PARSER);
    }

    @Override // defpackage.aooy
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int a = aopi.a.b(this).a(this);
        this.memoizedSerializedSize = a;
        return a;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int b = aopi.a.b(this).b(this);
        this.memoizedHashCode = b;
        return b;
    }

    @Override // defpackage.aooz
    public final boolean isInitialized() {
        return isInitialized(this, Boolean.TRUE.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void makeImmutable() {
        aopi.a.b(this).f(this);
    }

    protected void mergeLengthDelimitedField(int i, aomf aomfVar) {
        ensureUnknownFieldsInitialized();
        aoqc aoqcVar = this.unknownFields;
        aoqcVar.d();
        if (i != 0) {
            aoqcVar.f(aoqp.c(i, 2), aomfVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected final void mergeUnknownFields(aoqc aoqcVar) {
        this.unknownFields = aoqc.b(this.unknownFields, aoqcVar);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        aoqc aoqcVar = this.unknownFields;
        aoqcVar.d();
        if (i != 0) {
            aoqcVar.f(aoqp.c(i, 0), Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // defpackage.aolo
    public aopc mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // defpackage.aooy
    public final aone newBuilderForType() {
        return (aone) dynamicMethod(aonl.NEW_BUILDER);
    }

    protected boolean parseUnknownField(int i, aomk aomkVar) {
        if (aoqp.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, aomkVar);
    }

    @Override // defpackage.aolo
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // defpackage.aooy
    public final aone toBuilder() {
        aone aoneVar = (aone) dynamicMethod(aonl.NEW_BUILDER);
        aoneVar.mergeFrom(this);
        return aoneVar;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        amkq.cJ(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.aooy
    public void writeTo(aomp aompVar) {
        aopq b = aopi.a.b(this);
        aomq aomqVar = aompVar.f;
        if (aomqVar == null) {
            aomqVar = new aomq(aompVar);
        }
        b.l(this, aomqVar);
    }

    protected static aomy fieldInfo(Field field, int i, aonb aonbVar, boolean z) {
        if (field == null) {
            return null;
        }
        aomy.b(i);
        aonz.i(field, "field");
        aonz.i(aonbVar, "fieldType");
        if (aonbVar == aonb.MESSAGE_LIST || aonbVar == aonb.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new aomy(field, i, aonbVar, null, null, 0, false, z, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean isInitialized(aonm aonmVar, boolean z) {
        byte byteValue = ((Byte) aonmVar.dynamicMethod(aonl.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = aopi.a.b(aonmVar).k(aonmVar);
        if (z) {
            aonmVar.dynamicMethod(aonl.SET_MEMOIZED_IS_INITIALIZED, true != k ? null : aonmVar);
        }
        return k;
    }

    protected static aono mutableCopy(aono aonoVar) {
        int size = aonoVar.size();
        return aonoVar.e(size == 0 ? 10 : size + size);
    }

    protected static aoov newMessageInfo(aoph aophVar, int[] iArr, Object[] objArr, Object obj) {
        return new aopz(aophVar, false, iArr, (aomy[]) objArr, obj);
    }

    public final aone createBuilder(aonm aonmVar) {
        return createBuilder().mergeFrom(aonmVar);
    }

    protected Object dynamicMethod(aonl aonlVar, Object obj) {
        return dynamicMethod(aonlVar, obj, null);
    }

    public static aonm parseFrom(aonm aonmVar, aomf aomfVar, aomw aomwVar) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, aomfVar, aomwVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    protected static aonp mutableCopy(aonp aonpVar) {
        int size = aonpVar.size();
        return aonpVar.e(size == 0 ? 10 : size + size);
    }

    public static aonm parseDelimitedFrom(aonm aonmVar, InputStream inputStream, aomw aomwVar) {
        aonm parsePartialDelimitedFrom = parsePartialDelimitedFrom(aonmVar, inputStream, aomwVar);
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aonm parseFrom(aonm aonmVar, aomk aomkVar) {
        return parseFrom(aonmVar, aomkVar, aomw.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aonm parseFrom(aonm aonmVar, aomk aomkVar, aomw aomwVar) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, aomkVar, aomwVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aont mutableCopy(aont aontVar) {
        int size = aontVar.size();
        return aontVar.e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aonm parseFrom(aonm aonmVar, InputStream inputStream) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, aomk.M(inputStream), aomw.a());
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    protected static aonm parsePartialFrom(aonm aonmVar, aomk aomkVar) {
        return parsePartialFrom(aonmVar, aomkVar, aomw.a());
    }

    protected static aomy fieldInfoForProto2Optional(Field field, long j, aonb aonbVar, Field field2) {
        return fieldInfoForProto2Optional(field, (int) (j >>> 32), aonbVar, field2, (int) j, false, null);
    }

    protected static aomy fieldInfoForProto2Required(Field field, long j, aonb aonbVar, Field field2) {
        return fieldInfoForProto2Required(field, (int) (j >>> 32), aonbVar, field2, (int) j, false, null);
    }

    public static aonm parsePartialFrom(aonm aonmVar, aomk aomkVar, aomw aomwVar) {
        aonm aonmVar2 = (aonm) aonmVar.dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
        try {
            aopq b = aopi.a.b(aonmVar2);
            b.h(aonmVar2, aoml.p(aomkVar), aomwVar);
            b.f(aonmVar2);
            return aonmVar2;
        } catch (aoob e) {
            if (e.a) {
                throw new aoob(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof aoob) {
                throw ((aoob) e2.getCause());
            }
            throw new aoob(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof aoob) {
                throw ((aoob) e3.getCause());
            }
            throw e3;
        }
    }

    public static aonu mutableCopy(aonu aonuVar) {
        int size = aonuVar.size();
        return aonuVar.e(size == 0 ? 10 : size + size);
    }

    public static aonx mutableCopy(aonx aonxVar) {
        int size = aonxVar.size();
        return aonxVar.e(size == 0 ? 10 : size + size);
    }

    public static aonm parseFrom(aonm aonmVar, InputStream inputStream, aomw aomwVar) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, aomk.M(inputStream), aomwVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aony mutableCopy(aony aonyVar) {
        int size = aonyVar.size();
        return aonyVar.e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aonm parseFrom(aonm aonmVar, ByteBuffer byteBuffer) {
        return parseFrom(aonmVar, byteBuffer, aomw.a());
    }

    public static aonm parseFrom(aonm aonmVar, ByteBuffer byteBuffer, aomw aomwVar) {
        aonm parseFrom = parseFrom(aonmVar, aomk.N(byteBuffer), aomwVar);
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    public static aonm parseFrom(aonm aonmVar, byte[] bArr) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, bArr, 0, bArr.length, aomw.a());
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aonm parseFrom(aonm aonmVar, byte[] bArr, aomw aomwVar) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, bArr, 0, bArr.length, aomwVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aonm parsePartialFrom(aonm aonmVar, byte[] bArr, int i, int i2, aomw aomwVar) {
        aonm aonmVar2 = (aonm) aonmVar.dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
        try {
            aopq b = aopi.a.b(aonmVar2);
            b.i(aonmVar2, bArr, i, i + i2, new aolt(aomwVar));
            b.f(aonmVar2);
            if (aonmVar2.memoizedHashCode == 0) {
                return aonmVar2;
            }
            throw new RuntimeException();
        } catch (aoob e) {
            if (e.a) {
                throw new aoob(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof aoob) {
                throw ((aoob) e2.getCause());
            }
            throw new aoob(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw aoob.j();
        }
    }

    private static aonm parsePartialFrom(aonm aonmVar, byte[] bArr, aomw aomwVar) {
        aonm parsePartialFrom = parsePartialFrom(aonmVar, bArr, 0, bArr.length, aomwVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }
}
